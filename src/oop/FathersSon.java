package oop;

public class FathersSon extends Father{

    int d;

    public FathersSon(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
        System.out.println("Son constructor");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Son: b:"+this.b+", c:"+this.c+", d:"+this.d); //不能访问a，因为是父类的private
    }

    public static void main(String[] args) {
        FathersSon fathersSon=new FathersSon(1,2,3,4);
        fathersSon.print();
    }
}
