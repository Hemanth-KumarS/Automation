package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
	@FindBy(id="container_tasks")
	private WebElement Taskbtn;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setTaskTab()
	{
		Taskbtn.click();
	}
	public void setLogout()
	{
		logoutbtn.click();
	}

}
