import org.openqa.selenium.chrome.ChromeDriver;

public class Googledemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
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

}
