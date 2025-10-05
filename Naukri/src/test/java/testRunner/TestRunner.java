package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/profile.feature",
				  glue={"stepDefinitions","hooks"},
				  plugin= {"pretty","json:target/cucumber.json"},
				  dryRun=false,
				  tags="@home_02"
				  //publish=true
				  )
public class TestRunner {

}
