package basic_lang;

public class ClinitAndInit {

    int s;

    // 静态变量和代码块会组合成 clinit 方法，整个类只有一个clinit方法
    static int x=0;
    static {
        System.out.println("static code, x:"+x);
        x++;
    }

    // 构造函数会编译成 init 方法，有几个构造函数就有几个init方法
    public ClinitAndInit() {
        System.out.println("constructor1, x:"+x);
        x++;
    }
    public ClinitAndInit(int s) {
        this.s = s;
        System.out.println("constructor2, x:"+x);
        x++;
    }

    public static void main(String[] args) {
        ClinitAndInit clinitAndInit=new ClinitAndInit();
        ClinitAndInit clinitAndInit1=new ClinitAndInit(2);
        System.out.println("main, x:"+x);
    }
}
