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

public class GetValuesUsingRegularExpression {



    WebDriver driver;
    public void waits(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    @Given("^user launch the application in browser$")
    public void user_launch_the_application_in_browser() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("^user enters valid \"(.*?)\" and \"(.*?)\"$")
    public void user_enter_valid_username_and_password(String username,String password) {
        // Write code here that turns the phrase above into concrete actions
        By username_Txt_Box=By.name("username");
        By password_Txt_Box=By.name("password");
        waits(username_Txt_Box);
        driver.findElement(username_Txt_Box).sendKeys(username);
        driver.findElement(password_Txt_Box).sendKeys(password);
    }
    @When("^user clicks the Login button$")
    public void user_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("user will navigate to HomeScreen.")
    public void user_will_navigated_orange_hrm_homepage() {
        String expectedText="Dashboard";
        By pageTitle=By.tagName("h6");
        waits(pageTitle);
        String actualText= driver.findElement(pageTitle).getText();
        Assert.assertEquals(actualText,expectedText);
        driver.quit();
    }
}
