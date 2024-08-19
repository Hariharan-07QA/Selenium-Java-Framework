package AutomationPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
   private WebDriver driver;
   @DataProvider(parallel = true)
   public static Object[][] getData()
   {
       return new Object[][]{
               {"Admin","admin123"},
               {"Admin123","admin12345"}
       };
   }

    @Test(dataProvider ="getData")
    public void dataProviderTest(String username,String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
        driver.close();
    }

}
