import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Content {

	public static void main(String[] args) {
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.amazon.in/");
		String str=obj.getPageSource();
		if(str.contains("amazonn")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");

	}

}
}
