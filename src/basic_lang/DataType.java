package basic_lang;

public class DataType {
    private byte byteType = 0b100; // -128 , 127
    private char charType; // \u0000 , \uFFFF
    private short shortType = 0xFFF; // -32768 , 32767
    private int intType = 32; // -21474_83648 , 21474_83647
    private long longType = 12L;
    private float floatType = 2.3F; // 有效位数6~7位
    private double doubleType = 2.4; // 有效位数15位
    private boolean booleanType = true;


    int noPrivate;
    public boolean isPublic;
    final boolean isFinal=true;
    static boolean isStatic=true;


    public DataType(int noPrivate, boolean isPublic) {
        this.noPrivate = noPrivate;
        this.isPublic = isPublic;
    }

    public static void main(String[] args) {
        DataType dataType=new DataType(32,true);

        //操作符，优先级从高到低
        long p1= dataType.longType++; // i-- 同
        int p2= dataType.byteType* dataType.intType/ dataType.shortType % dataType.byteType;
        double p3= dataType.doubleType+ dataType.intType- dataType.floatType;
        long p4= dataType.longType<<2>>>2;
        boolean p5=dataType.byteType>10;
        boolean p6=dataType.byteType==10;
        int p7= dataType.byteType & 0b00000011;
        int p8=dataType.byteType ^ 0b00000011;
        int p9=dataType.byteType | 0b00000011;
        boolean p10= dataType.isFinal && dataType.isPublic;
        boolean p11=dataType.isFinal || dataType.isPublic;
        int p12=dataType.isFinal ? 10: 11;
        int p13=dataType.byteType+=10;

        System.out.printf("%d %d %f %d %b %b %d %d %d %b %b %d %d \n",p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13);

    }
}
