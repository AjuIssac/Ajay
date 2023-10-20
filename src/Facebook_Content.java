import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Content {

	public static void main(String[] args) {
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com/");
		String str=obj.getPageSource();
		if(str.contains("facebook")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}

	}

}
