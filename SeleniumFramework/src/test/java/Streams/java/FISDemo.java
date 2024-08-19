package Streams.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/test/java/GenericsJava/abc.txt");
        int data;
        while((data=fis.read())!=-1)
        {
            System.out.println("data :"+(char)data);
        }
        fis.close();
    }
}
