
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_Junit_locator {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.get("https://www.netflix.com/signup/regform");
	}
	
	@Test
	public void TitleVerifcation() {
		String str=driver.getTitle();
		String str2="netflix";
		if (str.equals(str2)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	
	@Test
	public void ContentVerification() {
		String str=driver.getPageSource();
		if(str.contains("Laughter")) {
			System.out.println("pass");
			
		}
		
		else {
			System.out.println("fail");
			
		}
	}
	
	@Test
	
	public void signup() {
		//driver.findElement(By.name("email"));
		driver.findElement(By.name("email")).sendKeys(("ajayissac.10@gmail.com"),Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys(("Mysaviour@10"),Keys.ENTER);
		
	}
	
	
	


}
