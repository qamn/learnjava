package oop;

public class OuterClass {

    /*
    内部类的作用：
        1.更好的封装，只在一个类中使用的类，可以定义成内部类，并且不允许其他地方访问。
        2.内部类可以访问外部类的 private 成员，类似于友元类。
        3.匿名内部类适用于创建仅用一次的情况，没有必要重新定义一个类。因为只需要定义一下，并只使用一次。
    内部类的注意点：
        1.可以使用 private、protected、static修饰。
        2.非static的内部类不能有static成员。
     */

    private class A{
        int a;

        public A(int a) {
            this.a = a;
        }

        public void print(){
            System.out.println("A.a: "+a);
        }
    }
    public void testA(){
        A a=new A(3); //a这个对象中有一个外部对象的引用，内部类实例必须寄生在外部类的实例中，所以外部类的static方法不能直接创建内部类的对象。
        a.print();
    }

    private static class B{
        int b;

        public B(int b) {
            this.b = b;
        }

        public void print(){
            System.out.println("B.b: "+b);
        }
    }

    public static void testAnonymousInnerClass(AInterface aInterface){
        long x=System.currentTimeMillis();
        if(x>1000000){
            aInterface.getDown();
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.testA();

        B b=new B(5); //外部类的静态方法可以直接创建静态内部类的对象，这时的静态内部类是独立的，不需要寄生在外部类的实例中。
        b.print();

        testAnonymousInnerClass(new AInterface() { // 一种常见的实现回调函数的方式
            @Override
            public void getDown() {
                System.out.println("this is getDown");
            }
        });
    }
}
