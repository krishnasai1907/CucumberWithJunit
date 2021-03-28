package com.automation.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\Features"
		,glue={"com.automation.StepDefs"}
		,tags="@tag",plugin={"pretty","html:test-output"})
public class TestRunners 
{

//	private TestNGCucumberRunner testNgcucumberrunner;
//	
//	@BeforeClass(alwaysRun=true)
//	public void SetUpClass()
//	{
//		testNgcucumberrunner=new TestNGCucumberRunner(this.getClass());
//	}
//	@Test(groups="cucumber",description="Runs Cucumber Feature",dataProvider="features")
//	public void feature(CucumberFeatureWrapper cucumberFeature)
//	{
//		testNgcucumberrunner.runCucumber(cucumberFeature.getCucumberFeature());
//	}
//	@DataProvider
//	public Object[][] features()
//	{
//		return testNgcucumberrunner.provideFeatures();
//	}
//	@AfterClass(alwaysRun=true)
//	public void tearDownClass()
//	{
//		testNgcucumberrunner.finish(); please use
//	}
}