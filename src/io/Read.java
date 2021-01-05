package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        File f=new File("z.txt");
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(f);
            byte[] data=new byte[(int)f.length()];
            fileInputStream.read(data,0,data.length);
            System.out.println("file contents:\n"+ new String(data));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
