package com.automation.StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.Utilities.Utility;

import cucumber.api.java.en.Then;

public class HomePage//With or without extends its working
{
	private Utility base;
	public HomePage(Utility base)
	{
		this.base=base;
	}
	
	@Then("^User click on submit button$")
	public void User_clickonsubmitbutton() throws Throwable {
		base.driver.findElement(By.id("btnLogin")).click();	
		 	    }
	@Then("^User landed on home page$")
	public void User_landed_on_home_page() throws Throwable {
	   WebDriverWait wait=new WebDriverWait(base.driver, 5000);
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Welcome')]")));
		Thread.sleep(1000);
		System.out.println("From another feature step:"+Utility.SharedData.get("Username"));
	    
	}
	}
