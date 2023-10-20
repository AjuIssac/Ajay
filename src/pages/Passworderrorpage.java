package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passworderrorpage {
	WebDriver driver;
	
	By forgotpassword=By.xpath("//*[@id=\"login_link\"]/div/a");
	By emailaddress=By.xpath("//*[@id=\"identify_email\"]");
	By search=By.xpath("//*[@id=\"did_submit\"]");
	
	public void forgotpass() {
		driver.findElement(forgotpassword).click();
	}
	
	public Passworderrorpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void email(String email) {
		driver.findElement(emailaddress).sendKeys(email);;
	}
	
	public void search() {
		driver.findElement(search).click();
	}
	
	
	

}
