import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngPractice {

    private WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    public void login() throws InterruptedException {
        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
    }

   @AfterMethod
    public void close() throws InterruptedException {
       Thread.sleep(4000);
       driver.quit();
   }
   @Test(groups = {"smoke"},dependsOnGroups = {"Regression"})
    public void tes1(){
       System.out.println("I am in Test1");
   }
   @Test(groups = {"login","Regression"})
    public void test2(){
       System.out.println("I am in test2");
   }
}
