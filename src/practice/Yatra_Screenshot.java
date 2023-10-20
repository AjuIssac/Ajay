package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_Screenshot {
	
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
	
	public void test() throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("./Screenshot/yatra.png"));
	}
	
	
	
	
	
	

}
