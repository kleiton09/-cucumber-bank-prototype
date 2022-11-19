import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		snippets = cucumber.api.SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		
		)
public class Runner {

}
