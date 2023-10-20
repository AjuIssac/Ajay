package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Demopage;

public class Demotest {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	
	public void url() {
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	
	public void test() {
		
		Demopage ob=new Demopage(driver);
		ob.values("ajay", "ccc","ssss@gmail.com", "23ee", "23ee");
		ob.register();
		
	}

}
