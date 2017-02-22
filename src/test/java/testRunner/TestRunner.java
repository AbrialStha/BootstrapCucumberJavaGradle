package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by pav15p on 22/02/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = false,
        features = "src/test/Features",
        glue = {"StepDefination"},
        monochrome = true,
        format = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json" },
        tags = { "~@ignore" }
        //tags = {"@forgot_password"}
)
public class TestRunner {

}