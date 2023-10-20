import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Facebook {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	public void login() {
		driver.findElement(By.id("email")).sendKeys("ajayissac.10@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	
	public void browserclose() {
		driver.close();
		
	}

}
