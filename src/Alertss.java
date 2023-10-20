import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertss {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/loc.html");
	}
	
	@Test
	
	public void Button() {
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
		
		Alert a=driver.switchTo().alert();
		
		String text=a.getText();
		if(text.equals("hello i am an alert box")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("234");
	}
}
