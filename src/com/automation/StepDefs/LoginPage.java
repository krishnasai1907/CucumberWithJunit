package com.automation.StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.Utilities.Config;
import com.automation.Utilities.ExcelData;
import com.automation.Utilities.JsonConfig;
import com.automation.Utilities.MainConfig;
import com.automation.Utilities.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage //With or without extends its working
{
	
	private Utility base;
	public LoginPage(Utility base)
	{
		this.base=base;
	}
//	@Before
//	public void Startup()
//	{
//		
//	}
//	@After
//	public void TearDown()
//	{
//		base.driver.quit();
//	}
	By user=By.id(Config.getProperties("loginPage.username.id","loginPage"));
	By pass=By.id(Config.getProperties("loginPage.password.id","loginPage"));
	@Given("^User enters the Url \"([^\"]*)\"$")
	public void user_enters_the_Url(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver",MainConfig.getProperties("chromeDriver"));
	    base.driver=new ChromeDriver();
		base.driver.get(url);
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	}

	@When("^User landed on webpage$")
	public void user_landed_on_webpage() throws Throwable {
			base.driver.findElement(By.xpath("//div[contains(text(),'LOGIN Panel')]")).isDisplayed();
	    }

	@Then("^User enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String username, String passwords) throws Throwable {
		System.out.println("Excel Value :"+ExcelData.getMapData("User1"));
		System.out.println("Json Value :"+JsonConfig.readJson("Password"));
		base.driver.findElement(user).sendKeys(ExcelData.getMapData("User1"));
		base.driver.findElement(pass).sendKeys(JsonConfig.readJson("Password"));
		
		
		  Utility.SharedData.put("Username", base.driver.findElement(By.xpath("//div[contains(text(),'LOGIN Panel')]")).getText());
//		  JsonConfig.writJson("UserName", base.driver.findElement(By.xpath("//div[contains(text(),'LOGIN Panel')]")).getText());
	}

	@Then("^User close the Browser$")
	public void userclosethebrowser()
	{
		base.driver.close();
	}
	
}
