import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_isdisplay {
ChromeDriver driver=new ChromeDriver();
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	
	public void display() {
		WebElement li=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=li.isDisplayed();
		if(b==true) {
			System.out.println("displayed");
		}
		else {
			System.out.println("not displayed");
		}
		
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		boolean c=a.isSelected();
		if(c) {
			System.out.println("selected");
		}
		else {
			System.out.println("not selected");
		}
		
		WebElement x=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean g=x.isSelected();
		if(g) {
			System.out.println("selected");
			
		}
		
		else {
			System.out.println("not slected");
		}
		
		
		
	}
}
