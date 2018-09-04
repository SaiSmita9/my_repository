package com.demo.testsuites;

import org.testng.annotations.Test;

import com.demo.mainclasses.BaseTest;
import com.demo.mainclasses.Homepage;

public class HomepageTest extends BaseTest{
	//public static WebDriver driver = null;
	
		
	@Test(priority=0)
	 public void setDriverr() throws Exception {
		
		 Homepage.openPage(); 
		 System.out.println("In Test priority 0");
	 }
	
	
	@Test(priority=1)
	 public void clickRegistrationLink() throws Exception {
		
		 Homepage.clickOnRegistrationLink(); 
		 System.out.println("In Test priority 1");
	 }
	
	
	
}
