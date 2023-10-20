import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Facebook {
	
	ChromeDriver driver;
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
	
	@Test
	
	public void dropp() {
		WebElement li=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(li);
		day.selectByValue("20");
		
		WebElement gi=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select(gi);
		month.selectByValue("2");
		
		WebElement ji=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year=new Select(ji);
		year.selectByValue("2000");
		
		List <WebElement> ki=day.getOptions();
		List <WebElement> pi=month.getOptions();
		List <WebElement> ni=year.getOptions();
		
		System.out.println("size of day " +ki.size());
		System.out.println("size of month " +pi.size());
		System.out.println("size of year " +ni.size());
		
	}

}
