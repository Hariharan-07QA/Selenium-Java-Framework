package AutomationPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static void main(String[] args) throws IOException {
        File file =new File(System.getProperty("user.dir")+"/config.properties");
        FileInputStream inputStream=new FileInputStream(file);
        Properties properties=new Properties();
        properties.load(inputStream);
        System.out.println(properties.getProperty("username"));
        String timeout=properties.getProperty("timeout");
        int i1= Integer.parseInt(timeout);
        System.out.println(i1);
        String tools= properties.getProperty("tool");
        String[] split= tools.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
