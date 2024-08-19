package rapidfs.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginPage {

    WebDriver driver;
    @BeforeSuite
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rapidfs.com/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
    }
    @Test
    public void loginPage() throws InterruptedException {
        Thread.sleep(10000);
       WebElement emailField= driver.findElement(By.xpath("//input[@type='email']"));
       emailField.sendKeys("cardholderlive7@gmail.com");
       WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
       passwordField.sendKeys("Test@123");
       driver.findElement(By.xpath("//button[@class='eureka-button eureka-button--primary rapid-login__login-btn']")).click();
    }
}
