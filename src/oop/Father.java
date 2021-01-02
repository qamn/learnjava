package oop;

public class Father { //如果用final修饰Father，就不能被继承
    private int a;
    protected int b;
    public int c;

    public Father(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Father constructor");
    }

    public void print(){ // 如果用final修饰方法，就不能被重写
        System.out.println("Father: a:"+a+", b:"+b+", c:"+c);
    }
}
