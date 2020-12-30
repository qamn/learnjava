package classload_reflect;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

/*
类加载的过程：加载、链接、初始化。链接的主要目的是将引用设置到对应的地址，包括验证、准备、解析。
类加载器：启动》扩展》应用程序类加载器》自定义类加载器。父子关系通过组合来实现。子加载器回委托给父加载器来工作。
 */
public class Aclassloader extends ClassLoader{

    private String classPath="C:\\Users\\jack\\Desktop\\java\\";

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println(name);
        Class<?> cl=null;
        try {
            byte[] bytes=getBytes(name);
            System.out.println("length:"+bytes.length);
            cl=defineClass(name,bytes,0,bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cl;
    }

    public static void main(String[] args) throws Exception{
        Aclassloader aclassloader=new Aclassloader();
        Class<?> class1=aclassloader.loadClass("Shit"); //加载之后会解析，如果遇到引用的类，会自动再去加载
        Method shit=class1.getMethod("shit");
        shit.invoke(null);
    }

    public byte[] getBytes(String className) throws Exception{
        String fileName=classPath+className+".class";
        File file=new File(fileName);
        byte[] res=new byte[(int)file.length()];
        FileInputStream fileInputStream=new FileInputStream(file);
        fileInputStream.read(res);
        fileInputStream.close();
        return res;
    }
}
