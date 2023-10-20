import org.openqa.selenium.chrome.ChromeDriver;

public class ContentVerification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String str=driver.getPageSource();
		System.out.println(str);
		
		
		if(str.contains("yahoo")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
	}

}
}
