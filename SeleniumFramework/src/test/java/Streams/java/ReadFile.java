package Streams.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


    public static void main(String[] args) {
        String filePath="src\\test\\java\\GenericsJava\\OldFile.txt";
        char [] chars =new char[100];
        try (FileReader reader= new FileReader(filePath)){
            reader.read(chars);
            System.out.println(chars);
            reader.read(chars);
            System.out.println(chars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
