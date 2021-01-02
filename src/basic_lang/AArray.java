package basic_lang;

import java.util.Arrays;

//数组也是在堆区存放的对象，栈区只是操作对象的索引。当栈区销毁后，索引页销毁，这种就是将要清除的对象。
public class AArray {

    public static byte[] sa=new byte[4];

    public static void main(String[] args) {
        int[] b=new int[5]; //用 iconst_5; newarray int; astore_1; 来创建数组，并将引用存放到局部变量表的slot1位置
        b[3]=29; // 用 aload_1; iconst_3; bipush 29; iastore; 将slot1的引用入栈，索引入栈，数值入栈，实现数组元素写入

        int[] a=new int[]{101,121,113}; // 本质上就是重复用 iconst_0; bipush 101; iastore; 来将数据存到数组相应位置，最后用astore_2将引用存入到局部变量表slot2的位置
        a[2]=101;

        sa[2]=11;
        int c=a.length+1; // arraylength指令取栈顶的数组索引指向的数组对象的length字段。

        int[][] c1={{1,2,3},{4,5}}; // 多维数组本质上就是引用的数组，并不是空间上的连续分配

        // Arrays工具类
        Arrays.copyOf(a,3);
        Arrays.copyOfRange(a,0,2);
        Arrays.fill(a,5);
        Arrays.asList(1,2,3,4,5);
        Arrays.binarySearch(a,2);
    }
}
