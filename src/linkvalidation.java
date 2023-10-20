import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkvalidation {
	
	ChromeDriver driver;
	String baseurl="https://www.google.co.in/";
	
	@Before
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	
	public void linkcount() throws Exception {
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		
		if(con.getResponseCode()==200) {
			System.out.println("valid-----" +baseurl);
		}
		
		else {
			System.out.println("invalid----" +baseurl);
		}
		
	}
	
}
