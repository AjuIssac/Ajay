package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_locators {
WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod()
		public void url() {
			driver.get("https://www.yatra.com/");
		}
	
	@Test
	
	public void test() {
		
		
		WebElement li=driver.findElement(By.name("flight_origin"));
		li.click();
		li.sendKeys("Dubai");
		
		
		
	}

}
