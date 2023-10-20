package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Opencart_actionsendkeys {
	
WebDriver driver;
	
	@BeforeTest
	
	public void set() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
				
		driver=new ChromeDriver(options);
		
		
	}
	
	@BeforeMethod
	
	public void urlloading() {
		driver.get("https://www.exploretock.com/signup?continue=%2Fcity%2Fchicago%2Fsearch");
	}
	
	@Test
	
	public void test() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		WebElement li=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		li.sendKeys("ajay");
		act.keyDown(li, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(li, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		WebElement gi=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		act.keyDown(gi, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
		
		act.perform();

		
	}

}
