package com.acitiTime.testscripts.login;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.xml.sax.Locator;

import com.acitiTime.testBase.TestBase;

public class TestLogin extends TestBase{
	
	@BeforeClass
	public void setup() throws IOException{
		init();
	}
	
	@Test
	public void testinglogin() throws Exception{
		
		WebElement userName = getWebElement("actiTime.login.username");
		userName.sendKeys(Repository.getProperty("username"));
		driver.wait();
		
		
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}

}
