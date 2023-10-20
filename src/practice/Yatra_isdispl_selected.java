package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_isdispl_selected {
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
		
		WebElement li=driver.findElement(By.xpath("//*[@id=\"themeSnipe\"]/section/div[2]/section[1]/div/a/img"));
		boolean b=li.isDisplayed();
		if(b) {
			System.out.println("displayed");
		
		}
		else {
			System.out.println("not displayed");
		}
		
		WebElement gi=driver.findElement(By.xpath("//*[@id=\"seniorcitizen_offer\"]/a/i"));
		boolean r=gi.isEnabled();
		if(r) {
			System.out.println("selected");
		
		}
		else {
			System.out.println("not ");
		}
		
		
		
		
	}

}
