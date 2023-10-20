import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_gettextverification {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	
	public void create() {
		WebElement li=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String text=li.getAttribute("value");
		if(text.equals("Create my account>>")) {
			System.out.println("pass");
			
		}
		
		else {
			System.out.println("fail");
		}
		
		
	}

}
