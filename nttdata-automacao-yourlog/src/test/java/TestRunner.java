import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "not @wip and not @quarentine",
		features = {"src/test/java/com/yourlog/requirements"}
		)
public class TestRunner {
	
}
