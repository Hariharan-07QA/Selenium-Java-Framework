package Streams.java;

import java.io.File;
import java.io.IOException;

public class FIleHandlingApp {
    public static void main(String[] args) {
        String path="src\\test\\java\\GenericsJava\\";
        File newFile=new File(path+"NewFile.txt");
        try {
            //To Create a New File
            if(newFile.createNewFile())
            {
                System.out.println("The File is Created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //To Rename the Old File
       File renamedFIle= new File(path+"OldFile.txt");
        if(newFile.renameTo(renamedFIle)){
            System.out.println("The File is Renamed");
        }
        //To Delete the Old File
//        if(renamedFIle.delete())
//        {
//            System.out.println("The File is Deleted");
//        }
    }
}
