package Streams.java;

import java.io.*;

public class BufferedWriterApp {
    public static void main(String[] args) {
        try (BufferedWriter writer =new BufferedWriter(new FileWriter("src/test/java/GenericsJava/BufferWriter.txt"))){
            writer.write("This sentence was written through buffer writer in Java sentence");
            writer.newLine();
            writer.write("I am in next line");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
