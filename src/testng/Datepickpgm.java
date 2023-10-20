package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickpgm {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void set() {
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	
	public void url() {
		
		driver.get("https://www.booking.com/");
		
		
	}
	
	@Test
	
	public void testlogin() {
		
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]")).click();
		
		while(true) {
			
			WebElement month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/h3"));
			
			String month2=month.getText();
			if(month2.equals("January 2024"))
			{
				System.out.println(month2);
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span")).click();
				
			}
		}
		
		List <WebElement> dates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span/span"));
		for(WebElement datelement:dates) {
			
			String date=datelement.getText();
			if(date.equals("22")) {
				datelement.click();
				break;
			}
		}
			
		
		
			

			
			
		}
	
	
	
	
	}
	
	
	
	
	
	

