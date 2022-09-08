package com.actitime.generiv;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;

	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Open Browser ",true);
		Reporter.log("openBrowser");
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Browser ",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("Login ",true);

		fileLib f=new fileLib();
		String Url = f.getPropertyData("Url");
		String un=f.getPropertyData("UserName");
		String pwd=	f.getPropertyData("Password");
		driver.get(Url);
		LoginPage l=new LoginPage(driver);
		l.setuser(un,pwd);


	}
	@AfterMethod
	public void logout()
	{
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();
		Reporter.log("Logout ",true);

	}
}
