package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shoppy_datadriven {
WebDriver driver;
	
	@BeforeTest
	
	public void set() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
	}
	
	@BeforeMethod
	
	public void urlloading() {
		driver.get("https://shoppyhup.com/user/login");
	}
	
	@Test
	
	public void test() throws IOException {
		driver.manage().window().maximize();
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\LUMINAR\\datadriven.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++) {
			String uname=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username" +uname);
			String pwd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("passwrod" +pwd);
			
			//driver.findElement(By.xpath("//*[@id=\"input-190\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-190\"]")).sendKeys(uname);
			driver.findElement(By.xpath("//*[@id=\"input-191\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-191\"]")).sendKeys(pwd);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div/div/div[2]/div/form/button")).click();
			driver.navigate().refresh();
		}
		
		
	}

}
