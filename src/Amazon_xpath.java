import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_xpath { 
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	
	public void mobile() {
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
	}

}
