import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class MultipleLinkValidation {
	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	
	
	@Test
	
	public void linkcount() {
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total link " +li.size());
		
		for(WebElement a:li) {
			String link=a.getAttribute("href");
			verify(link);
		}
	}
	
	public void verify(String link) {
		try {
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			
			con.connect();
			
		if(con.getResponseCode()==200) {
			System.out.println("valid link---" +link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("broken link" +link);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}


