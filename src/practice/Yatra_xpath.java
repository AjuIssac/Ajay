package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_xpath {
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
		//Alert a=driver.switchTo().alert();
		//a.accept();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"yt_business_link\"]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[4]/div/form/ul/li[1]/input")).sendKeys("abc@gmail.com");
		driver.navigate().back();
		
	}
	
	

}
