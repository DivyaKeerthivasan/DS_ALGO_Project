package runner;
import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/divya.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
				monochrome=true,  //console output colour
				//tags from feature file
				//tags="@Register",
				//tags = "@Login",
				//tags="@Stack",
				//tags = "@startpage",
				//tags = "@arrayhome",
				//tags = "@tree",
						glue= {"stepdefinitions","page_model"},
				features = {"src/test/resources/Features"}//location of feature files
			
				)
				//tags = "@startpage") //location of step definition files

		public class Test_Runner extends AbstractTestNGCucumberTests{

			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();	
			
}
		}

