import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Netflix {
	
ChromeDriver driver;
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
	}
	
	@Test
	
	public void net() throws Exception {
		File g=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		WebElement li=driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/h1"));
		File j=li.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(g, new File("./Screenshot/netflix.png"));
		FileHandler.copy(j, new File("./Screenshot/text.png"));
	}

}
