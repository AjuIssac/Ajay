package practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_tagname {

	
WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
				
		driver=new ChromeDriver(options);
	}
	
	@BeforeMethod()
		public void url() {
			driver.get("https://www.yatra.com/");
		}
	
	@Test
	
	public void test() {
		List<WebElement> li=driver.findElements(By.tagName("input"));
		System.out.println(li.size());
		for(WebElement a:li) {
			String l=a.getAttribute("href");
			System.out.println(l);
		}
	}
}
