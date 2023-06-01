package runnerFiles;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\cucumber\\src\\main\\java\\Features\\login.orange.feature",
					glue={"stepDefinationFiles"},
					monochrome=true,
					plugin={"pretty"},
					tags="@all"
					)


public class Testrunner {

}
