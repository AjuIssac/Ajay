import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Title {

	public static void main(String[] args) {
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com/");
		String str=obj.getTitle();
		System.out.println(str);
		String str2="Facebook – log in or sign up";
		if(str.equals(str2)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
