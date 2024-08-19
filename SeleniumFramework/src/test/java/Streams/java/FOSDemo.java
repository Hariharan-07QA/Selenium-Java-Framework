package Streams.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/test/java/GenericsJava/bbc.txt");
        fos.write(93);
        fos.close();
    }
}
