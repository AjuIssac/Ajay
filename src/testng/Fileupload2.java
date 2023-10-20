package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload2 {
WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@BeforeMethod
	
	public void urlload() {
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@Test
	
	public void test() throws AWTException {
		
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		String p="C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\CIPR_Document.pdf";
		fileUpload(p);
		
	}
	
	public void fileUpload(String p) throws AWTException {
		//to copy path to clipboard
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		//to paste to systemwindow
		Robot robot=new Robot();
		robot.delay(3000);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
