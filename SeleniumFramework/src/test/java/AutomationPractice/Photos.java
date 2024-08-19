package AutomationPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Photos {

    private WebDriver driver;
    @Test
    public void screenShot() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        TakesScreenshot shots = (TakesScreenshot) driver;
        File source = shots.getScreenshotAs(OutputType.FILE);
        File target =new File(System.getProperty("user.dir")+"/abcd.png");
        FileUtils.copyFile(source,target);
    }
}
