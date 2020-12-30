package basic_lang;

public class AString {
    public static void main(String[] args) {
        String s1="aaa";
        String s2="aaa"; // 这两个引用都是直接指向常量池中的“aaa”，所以相等
        String s3= new String("aaa"); // 这里会在堆中创建一个String对象，s3这个引用指向这个对象

        String s4=s1+"123"; //"+"运算符作用于字符串，会创建一个StringBuilder，然后调用append方法

        String s6=null;
        s6=s3; // null和""是不同的，判断分别是 s6==null, s6.equals("") , s6.length()==0

        StringBuilder sb=new StringBuilder("123");
        sb.append(12);sb.append(s2);sb.append(s4); // 不同的参数调用的是不同的append方法
        System.out.println(sb);
    }
}
