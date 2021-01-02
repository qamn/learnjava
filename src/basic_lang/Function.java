package basic_lang;

public class Function {

    /* 可变参数 */
    public static void variableArg(int... args){ // args是数组
        System.out.println("args num: "+args.length);
        for(int x:args){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    /* 引用传递 */
    static class SwapTest{
        int a;
        int b;

        public SwapTest(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public void print(){
            System.out.println(a+" , "+b);
        }
    }
    public static void sendArgs(SwapTest swapTest){
        int tmp=swapTest.a;
        swapTest.a= swapTest.b;
        swapTest.b=tmp;
    }

    /* 递归方法 */
    /*
        递归的核心：
            1.找到F(n)和F(n-1)的关系，例如这个例子中就是 F(n)=F(n-1)+1
            2.找到结束条件：这个例子就是 i==x.length。
     */
    static int sum(int[] x, int i){
        if(i==x.length){
            return 0;
        }
        return x[i]+sum(x,i+1);
    }


    public static void main(String[] args) {
        variableArg(1,2,3);
        variableArg(4,3,5,6,7,8);

        SwapTest s=new SwapTest(3,4);
        System.out.print("before swap: ");s.print();
        sendArgs(s);
        System.out.print("after swap: ");s.print();

        int[] x={1,2,3,4};
        System.out.println(sum(x,0));
    }
}
