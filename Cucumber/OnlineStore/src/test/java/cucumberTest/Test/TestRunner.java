package cucumberTest.Test;

/**
 * Created by mansi.pattani on 3/2/16.
 */
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/cucumberTest/Test"},
        glue = {"cucumberTest.Test"},
        format = {"pretty","html:target/html/"}

)
public class TestRunner {
}
