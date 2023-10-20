package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demopage {
	
	WebDriver driver;
	
	By name=By.xpath("//*[@id=\"name\"]");
	By comp=By.xpath("//*[@id=\"company\"]");
	By email=By.xpath("//*[@id=\"email\"]");
	By pwd=By.xpath("//*[@id=\"password\"]");
	By conpwd=By.xpath("//*[@id=\"password-confirm\"]");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	
	public Demopage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void values(String dname,String dcomp,String demail,String dpwd,String dconpwd) {
		driver.findElement(name).sendKeys(dname);
		driver.findElement(comp).sendKeys(dcomp);
		driver.findElement(email).sendKeys(demail);
		driver.findElement(pwd).sendKeys(dpwd);
		driver.findElement(conpwd).sendKeys(dconpwd);
		
		
		
	}
	
	public void register() {
		driver.findElement(register).click();
	}
	

}
