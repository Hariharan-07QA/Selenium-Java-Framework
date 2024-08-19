package Streams.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {
    public static void main(String[] args) {
        String path ="src/test/java/GenericsJava/printWriter.txt";
        try (PrintWriter writer =new PrintWriter(new FileWriter(path,true))){
            /* If we pass append true to the File Writer constructor
            the same text append to file every time while running*/
            writer.println("This text printed by print Writer");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
