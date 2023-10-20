import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	ChromeDriver driver;
	
	@Before
	public void setup(){
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void TitleVerification() {
		String str=driver.getTitle();
		System.out.println(str);
		String str2="Google";
		if(str.equals(str2)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void ContentVerification() {
		String str=driver.getPageSource();
		
		
		
		if(str.contains("yahoo")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
	}
	}
	
	@After
	public void browserclose() {
		driver.close();
	}
	
	

}
