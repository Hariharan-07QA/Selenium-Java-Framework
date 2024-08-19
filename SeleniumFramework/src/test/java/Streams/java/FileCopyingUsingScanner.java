package Streams.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyingUsingScanner {
    public static void main(String[] args) throws IOException {

        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter Source File :");
        String sourceFile=sc1.next();
        System.out.println("Enter Destination File :");
        String destinationFile= sc1.next();
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos =new FileOutputStream(destinationFile);

        int data;
        while((data=fis.read())!=-1)
        {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
