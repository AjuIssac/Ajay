package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fblogin_pagefactory;

public class Fblogintest_pagefactory {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	
	public void url() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	public void testlogin() {
		Fblogin_pagefactory ob=new Fblogin_pagefactory(driver);
		ob.setvalues("abc@gmail.com","abcd");
		ob.login();
		
		
	}

}
