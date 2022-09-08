package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasklistPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustbtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customernamebtn;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustDescription;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement SelectCustDD;
	
	@FindBy(xpath="//div[text()='aaasss' and @class='itemRow cpItemRow ']")
	private WebElement SelectOurCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement VerifyCustomer;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectopt;
	
	// constructor block 

	public TasklistPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// getter methods 
	public WebElement getVerifyCustomer() {
		return VerifyCustomer;
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewCustbtn() {
		return newCustbtn;
	}

	public WebElement getCustomernamebtn() {
		return customernamebtn;
	}

	public WebElement getEntercustDescription() {
		return entercustDescription;
	}

	public WebElement getSelectCustDD() {
		return SelectCustDD;
	}

	public WebElement getSelectOurCompany() {
		return SelectOurCompany;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}
	
	
	
	
	

}
