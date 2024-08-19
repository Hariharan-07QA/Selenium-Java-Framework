import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPractice {
   WebDriver driver=new ChromeDriver();
    @Test
    public void driverFunction() throws InterruptedException {
         //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sselvakumar\\BrowserDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
         driver.get("https://opensource-demo.orangehrmlive.com/");
         driver.manage().window().maximize();
         Thread.sleep(5000);
        String ele1=driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).getText();
        String ele2="Login";
        Assert.assertEquals(ele1,ele2);
         driver.close();
    }
    @Test
    public  void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        WebElement element=driver.findElement(By.xpath(""));
    }

}

