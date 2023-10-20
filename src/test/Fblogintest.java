package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;
import pages.Passworderrorpage;

public class Fblogintest {
	
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
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com","abcd");
		ob.login();
		
		Passworderrorpage li=new Passworderrorpage(driver);
		li.forgotpass();
		li.email("ajayissac.10@gmail.com");
		li.search();
	}

}
