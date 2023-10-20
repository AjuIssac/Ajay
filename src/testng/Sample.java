package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
WebDriver driver;
	
	@BeforeTest
	
	public void set() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
				
		driver=new ChromeDriver(options);
	}
	
	@BeforeMethod
	
	public void urlloading() {
		driver.get("https://marinersforex.com/Flights-Booking");
	}
	
	@Test
	
	public void test() {
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement li=driver.findElement(By.xpath("//*[@id=\"country-select-demo\"]"));
		
		//Actions act=new Actions(driver);
		//act.doubleClick(li);
		//act.perform();
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[1]/div/div")));
		
		li.click();
		li.sendKeys("dubai");
		WebElement gi=driver.findElement(By.xpath("//*[@id=\"country-select-demo\"]"));
		gi.click();
		
		gi.sendKeys("paris");
		
	}

}
