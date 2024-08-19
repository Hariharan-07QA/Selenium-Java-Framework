package Cucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/LoginOrangeHrmUsingRegularExpression.feature",
        glue = "Cucumber.StepDefinition.GetValuesUsingRegularExpression")
public class RunnerClass {

    // This class will used to join the step definition & feature file for that Step definition
    //Cucumber by default runs based junit

}
