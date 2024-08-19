package Streams.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/GenericsJava/abc.txt");
        FileOutputStream fos =new FileOutputStream("src/test/java/GenericsJava/bbc.txt",true);

        int data;
        while((data=fis.read())!=-1)
        {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
