package com.actitime.testscript;

import org.testng.Reporter;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generiv.BaseClass;
import com.actitime.generiv.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void CreatCustomer()
	{
		Reporter.log("CreateCustomer", true);
	}
	
	

}
