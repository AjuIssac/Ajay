import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Title {

	public static void main(String[] args) {
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.amazon.in/");
		String str=obj.getTitle();
		System.out.println(str);
		String str2="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(str.equals(str2)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");

	}

}
}
