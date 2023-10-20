import java.io.File;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Element {
	ChromeDriver driver;
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void element() throws Exception {
		
		WebElement li=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		File f=li.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(f, new File("./Screenshot/month.png"));
		
		
	}
	
	

}
