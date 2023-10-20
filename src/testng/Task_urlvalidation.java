package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Task_urlvalidation {

	WebDriver driver;
@BeforeTest
	
	public void set() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	
	public void urlloading() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		String u=driver.getCurrentUrl();
		String v="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(u, v);
	}
	
}
