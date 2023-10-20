package testng;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIT {

WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@BeforeMethod
	
	public void urlload() {
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@Test
	
	public void test() throws Exception   {
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\OneDrive\\Desktop\\LUMINAR\\autoit.exe");
		
	}
	
	
	
}
