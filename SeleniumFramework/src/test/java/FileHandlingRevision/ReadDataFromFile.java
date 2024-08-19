package FileHandlingRevision;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
    public static void main(String[] args) throws IOException {

        String filePath= System.getProperty("user.dir")+"\\abc.txt";
        System.out.println(filePath);
        FileInputStream fileInputStream=new FileInputStream(filePath);
        int data ;
        while ((data =fileInputStream.read())!=-1) {
            System.out.println((char) data);
        }
       // FileReader reader =new FileReader(filePath);
    }
}
