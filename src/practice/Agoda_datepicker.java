package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Agoda_datepicker {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	
	}
	
	@BeforeMethod
	public void url() {
		driver.get("https://www.agoda.com/search?city=9927&site_id=1891435&tag=a14f6081-c41d-4f13-9c6e-60f83612af7f&device=c&network=g&adid=579047927165&rand=13507859954259549658&expid=&adpos=&aud=kwd-5593367084&gclid=Cj0KCQjw1OmoBhDXARIsAAAYGSG-e_6PGHAKppQYJHwLq3n3Fi-WeNqlV5KKqI1rFfgxesTtSS4uGQ0aAgPBEALw_wcB&pslc=1");
	}
	
	@Test
	
	public void test() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"check-in-box\"]/div/span/i")).click();
		while(true) {
			WebElement month=driver.findElement(By.xpath("///*[@id=\"SearchBoxContainer\"]/div/div/div[5]/div/div/div/div[2]/div/div[2]/div[1]/div[1]"));
			String mon=month.getText();
			if(mon.equals("October 2023")) {
				System.out.println(mon);
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"SearchBoxContainer\"]/div/div/div[5]/div/div/div/div[2]/div/div[1]/div[2]/button")).click();
			}
			
		}
		
		List <WebElement> days=driver.findElements(By.xpath("//*[@id=\"SearchBoxContainer\"]/div/div/div[5]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div/span"));
		
		for(WebElement d:days) {
			String day=d.getText();
			if(day.equals("18")) {
				d.click();
				break;
			}
		}
		
		
	}
	

}
