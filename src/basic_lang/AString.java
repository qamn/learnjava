package basic_lang;

public class AString {
    public static void main(String[] args) {
        /* 源码中的字符串存储在常量池中 */
        String s1="aaa";
        String s2="aaa"; // 这两个引用都是直接指向常量池中的“aaa”，所以相等
        String s3= new String("aaa"); // 这里会在堆中创建一个String对象，s3这个引用指向这个对象

        /* +作用于字符串 */
        String s4=s1+"123"; // 会创建一个StringBuilder，然后调用append方法
        String s5="shit"+"123"; // 在编译时生成“shit123”

        /* 判断相等 */
        String s6=null;
        s6=s3; // null和""是不同的，判断分别是 s6==null, s6.equals("") , s6.length()==0

        /* StringBuilder构造字符串更加高效 */
        StringBuilder sb=new StringBuilder("123");
        sb.append(12);sb.append(s2);sb.append(s4); // 不同的参数调用的是不同的append方法
        sb.insert(2,"1234");
        sb.delete(2,4);

        /* 其他常用函数 */
        String s7=sb.toString();
        s7.trim(); //去掉首尾空格
        s7.substring(3); s7.substring(1,4);
        s7.replace(" ",""); //删除所有空格

        /* 正则表达式 */

    }
}
