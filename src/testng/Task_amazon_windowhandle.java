package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task_amazon_windowhandle {
	WebDriver driver;
	@BeforeTest
	
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@BeforeMethod
	
	public void url() {
		driver.get("https://www.amazon.in/");
		
	}
	
	@Test
	public void windowhandle() {
		
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(("mobile phones"),Keys.ENTER);
		String str=driver.getTitle();
		System.out.println(str);
		if(str.equals("Amazon.in : mobile phones")) {
			System.out.println("title pass");
			
		}
		
		else {
			System.out.println("title fail");
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> childwindow=driver.getWindowHandles();
		
		for(String handle:childwindow) {
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				
			}
			
		}
		
		
		
	}
	
	

}
