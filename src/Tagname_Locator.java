import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Locator {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");;
	}
	
	@Test
	
	public void test() {
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("no of links" +li.size());
		
		for(WebElement a:li) {
			System.out.println(a.getAttribute("href"));
			System.out.println(a.getText());
		}
		
	}
	
	
	

}
