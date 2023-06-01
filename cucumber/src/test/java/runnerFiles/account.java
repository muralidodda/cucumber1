package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\cucumber\\src\\main\\java\\Features\\account.feature",
                                glue = {"stepDefinationFiles"},
                                plugin = {"pretty"}
		)

public class account {

}
