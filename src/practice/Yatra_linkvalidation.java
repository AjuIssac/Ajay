package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_linkvalidation {
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
	
	public void linkss() {
		
		List <WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("size" +li.size());
		for(WebElement a:li) {
			String link=a.getAttribute("href");
			test(link);
		}
	}
	public void test(String link) {
		try {
		URL ob=new URL(link);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		
		if(con.getResponseCode()==200) {
			System.out.println("valid----" +link);
		
	}
		else {
			System.out.println("inavlid--" +link);
		}
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
