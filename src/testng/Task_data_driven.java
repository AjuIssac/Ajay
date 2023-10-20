package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task_data_driven {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	
	public void url() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Test
	
	public void main() throws IOException {
		String x1=("C:\\Users\\HP\\OneDrive\\Desktop\\LUMINAR\\datadriventask.xlsx");
		File f=new File(x1);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		for(int i=1;i<=sh.getLastRowNum();i++) {
			
			String username=getCellValue(x1,i,0);
			System.out.println("username" +username);
			String password=getCellValue(x1,i,1);
			System.out.println("password" +password);
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			driver.navigate().refresh();
			
		}
	
		
		
		}
	
	public static String getCellValue(String x1,int r, int c)
	{
		try
		{
			File f=new File(x1);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=(XSSFCell) wb.getSheet("Sheet1").getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING) {
				return cell.getStringCellValue();
				
			}
			else {
				return cell.getRawValue();
			}
		}
		
		catch (Exception e) {
			return "";
		}
		
	}
	
		
		
	
	
	
	
	

}
