package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

    public static void main(String[] args) {
        File f=new File("z.txt");
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(f);
            byte[] data="this is shit,\nThis is also a shit.\n".getBytes();
            fileOutputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
