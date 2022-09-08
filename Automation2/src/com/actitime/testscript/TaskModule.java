package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generiv.BaseClass;
import com.actitime.generiv.ListenerImplementation;
import com.actitime.generiv.fileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TasklistPage;
@Listeners(com.actitime.generiv.ListenerImplementation.class)

public class TaskModule  extends BaseClass{

	
		@Test
		public void CreatTask() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Reporter.log("CreateCustomer", true);
			Thread.sleep(4000);
			fileLib f=new fileLib();
			String CustomerName=f.getExcleData("Sheet1",1,2);
			String CustomerDescription=f.getExcleData("Sheet1",1,3);
			EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
			e.setTaskTab();
			TasklistPage t=new TasklistPage(driver);
			t.getAddnewbtn().click();
			t.getNewCustbtn().click();
			t.getCustomernamebtn().sendKeys(CustomerName);
			t.getEntercustDescription().sendKeys(CustomerDescription);
			t.getSelectCustDD().click();
		
			t.getSelectOurCompany().click();
			
			t.getCreateCustomer().click();
			Thread.sleep(5000);
		String	text=t.getVerifyCustomer().getText();
	
			Assert.assertEquals(text,CustomerName);
			
			
		}
		
}
