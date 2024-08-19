package Streams.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {
    public static void main(String[] args) {
        String filePath="src\\test\\java\\GenericsJava\\OldFile.txt";
        try(FileReader fileReader=new FileReader(filePath)) {
            BufferedReader reader=new BufferedReader(fileReader);
            StringBuilder builder=new StringBuilder();
            String line;
            while ((line=reader.readLine())!=null)
            {
                builder.append(line);
                builder.append(System.lineSeparator());
            }
            System.out.println(builder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;

    }
}
