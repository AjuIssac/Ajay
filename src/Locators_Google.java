import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Google {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/?sa=X&ved=0ahUKEwjMu7iu1InrAhVa63MBHSQYDGsQOwgC");
		
	}
	
	@Test
	public void login() {
		//driver.findElement(By.name("q"));
		//driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(("selenium"),Keys.ENTER);
		
		
	}
	
	
	

}
