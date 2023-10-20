package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_testing {
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
		String title=driver.getTitle();
		System.out.println(title);
		String ti="yatra";
		if(title.equals(ti)) {
			System.out.println("title same");
		}
		
		else {
			System.out.println("not same");
		}
	}
	@Test
	public void test2() {
		String content=driver.getPageSource();
		if(content.contains("yatra")) {
			System.out.println("contains");
		}
		
		else {
			System.out.println("not contains");
		}
	}
	
	
	

}
