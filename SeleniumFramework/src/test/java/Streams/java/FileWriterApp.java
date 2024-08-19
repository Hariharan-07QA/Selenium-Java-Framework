package Streams.java;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {

        String filePath ="src/test/java/GenericsJava/fileWriter.txt";
        try(FileWriter writer=new FileWriter(filePath)) {
            writer.write("I Written my first file using file writer class");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
