import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Locator {
 	
   ChromeDriver driver=new ChromeDriver();
   @Before
   public void  setup() {
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
   }
   
   @Test
   
   public void site() {
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(("mobile"),Keys.ENTER);
	   driver.findElement(By.xpath("//*[@id='nav-cart-text-container']/span[2]")).click();
       driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
       driver.findElement(By.xpath("//input[@id='continue']")).click();
       driver.navigate().back();
       driver.navigate().back();
      driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
      driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i[1]")).click();
       
    
   
   
   }
   

}
