package Streams.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyMoveApp {
    public static void main(String[] args) {
        Path originalPath =Paths.get("src/test/java/GenericsJava/printWriter.txt");
        Path destinationPath =Paths.get("src/test/java/AutomationPractice/printWriter.txt");

        try {
            //Files.copy(originalPath,destinationPath);
            if(Files.exists(originalPath)) {
                Files.move(originalPath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
