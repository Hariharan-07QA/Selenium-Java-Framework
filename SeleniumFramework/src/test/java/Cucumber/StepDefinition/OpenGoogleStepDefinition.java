package Cucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleStepDefinition {

    WebDriver driver;

    @Given("user is entering google.co.in")
    public void user_is_entering_google_co_in() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");

    }
    @When("user is typing the search term as {string}")
    public void user_is_typing_the_search_term_as(String searchTerm) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(searchTerm);
    }
    @When("user clicks the enter key")
    public void user_clicks_the_enter_key() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }
    @Then("user should see the search results")
    public void user_should_see_the_search_results() {
        // Write code here that turns the phrase above into concrete actions
        boolean status =driver.findElement(By.partialLinkText("Amazon")).isDisplayed();
        if(status)
        {
            System.out.println("Test Passed");
        }
        driver.quit();
    }
}
