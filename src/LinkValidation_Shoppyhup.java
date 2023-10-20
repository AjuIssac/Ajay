import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation_Shoppyhup {
	
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://shoppyhup.com/all-categories");
	}
	
	@Test
	
	public void link()  {
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("size" + li.size());
		for (WebElement a:li) {
			String links=a.getAttribute("href");
			verify(links);
		}
	}
	
	public void verify(String links) {
		try {
			
		
		URL ob=new URL(links);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		
		if(con.getResponseCode()==200) {
			System.out.println("valid----"  + links);
			
		}
		
		else if(con.getResponseCode()==500) {
			System.out.println("server error----"  +links);
		}
		
		else {
			System.out.println("invalid----" +links);
		}
	}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	

}
