package Streams.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreationExceptionApp {
    public static void createFile(String fileName)
    {
        try {
            PrintWriter outputFile=new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
     createFile("outputFile.txt");
    }
}
