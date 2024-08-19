package Cucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginOrangeHrmStepDefinition {


    WebDriver driver;
    public void waits(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    @Given("user is on OrangeHrm login page")
    public void user_is_on_orange_hrm_login_page() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("user enter valid username and password")
    public void user_enter_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        By username=By.name("username");
        By password=By.name("password");
        waits(username);
        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("user will navigated OrangeHrm Homepage")
    public void user_will_navigated_orange_hrm_homepage() {
        String expectedText="Dashboard";
        By pageTitle=By.tagName("h6");
        waits(pageTitle);
      String actualText= driver.findElement(pageTitle).getText();
        Assert.assertEquals(actualText,expectedText);
        driver.quit();
    }
}
