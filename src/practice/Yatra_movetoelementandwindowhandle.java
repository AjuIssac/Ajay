package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra_movetoelementandwindowhandle {
	
WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
				
		driver=new ChromeDriver(options);
	}
	
	@BeforeMethod
		public void url() {
			driver.get("https://www.yatra.com/");
		}
	
	@Test
	
	public void test() {
		String parentwindow=driver.getWindowHandle();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement more=driver.findElement(By.xpath("//*[@id=\"bEnginePos\"]/ul/li[7]/span"));
		Actions act=new Actions(driver);
		act.moveToElement(more);
		act.perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"booking_engine_luxury_trains\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"booking_engine_luxury_trains\"]/span")).click();
		
		Set <String> childwindow=driver.getWindowHandles();
		for(String handle:childwindow) {
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/a[1]/span")));
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/a[1]/span")).click();
				
				
			}
		}
		
		
		//act.contextClick(flights);
		//act.perform();
		
	}

	
	
}
