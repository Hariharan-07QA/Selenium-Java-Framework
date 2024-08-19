package Streams.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class DirectoryApp {
    public static void main(String[] args) {
        File newDirectory =new File("\\Ebooks\\Books");
        if(newDirectory.mkdirs())
        {
            System.out.println("New Directory is created");
        }
        else
        {
            System.out.println("Directory is not created");
        }
         File filepath=new File("src\\test\\java\\GenericsJava");
        System.out.println("File is GenericsJava Directory");
        System.out.println(Arrays.toString(filepath.list()));
        System.out.println(Arrays.toString(filepath.listFiles()));
        String path ="src\\test\\java\\GenericsJava\\";
        File newFile= new File(path+"RichDadPoorDad.txt");
        try {
            if(newFile.createNewFile())
            {
                newFile.setWritable(true);
                FileWriter writer =new FileWriter(path+"RichDadPoorDad.txt");
                writer.write("This file created by the Java Program");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
