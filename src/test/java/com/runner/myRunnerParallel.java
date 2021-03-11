package com.runner;



import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(ExtendedCucumber.class)
//		@ExtendedCucumberOptions(retryCount = 3)


@CucumberOptions(
		features = {"src/test/resources/feature/"},
		glue= {"stepDefinition","com.hooks"},
		plugin = {"pretty",
				"rerun:target/rerun.txt"},
		monochrome=true,
		publish = true
		)

public class myRunnerParallel extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
