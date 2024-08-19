package FileHandlingRevision;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoFile {
    /*1. FileOutputStream used to write data into a file
      2. It will write 1 byte data into a file, Create FileOutputStream
      3. Create Object to create stream connection between file & java program
     */
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "\\Write.txt";
        System.out.println(filePath);
        FileOutputStream fileOutputStream =new FileOutputStream("filePath");
        fileOutputStream.write(14);
        fileOutputStream.flush();
    }
}
