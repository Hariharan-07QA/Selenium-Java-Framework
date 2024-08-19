package AutomationPractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class ExtendReports {
    ExtentReports extent;
    ExtentSparkReporter spark;
    ExtentTest loginTest;
    WebDriver driver;
    @BeforeSuite
    public void beforeSuite()
    {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/report.html");
        extent.attachReporter(spark);
    }
    @BeforeMethod
    public void setup(Method method)
    {
         loginTest=extent.createTest(method.getName());
    }

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginTest.pass("Url is Loaded");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin123");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        loginTest.pass("User entered the username and password");
    }
    @AfterSuite
    public void afterSuite()
    {
        extent.flush();
        driver.close();
    }
}
