package ScottM.DemoMavenCucumberProject;

	
	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	   //path of feature file
	   features = "C:/Users/User/bddEnvironment/DemoMavenCucumberProject/Feature/Test.feature",
	   
	   //path of step definition file
		glue={"stepDefinitions"}
)
	   
	public class TestRunner {
	}

