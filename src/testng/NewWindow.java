package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewWindow {
	
	WebDriver driver;
	
@BeforeTest
	
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	
	public void url() {
		driver.get("https://demo.guru99.com/popup.php");
		
	}
	
	@Test
	
	public void newwindow() {
		
		//WebDriver driver2=driver.switchTo().newWindow(WindowType.TAB);
		WebDriver driver2=driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver2.get("https://www.google.co.in/");
	}
	

}
