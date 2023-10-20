package testpkg_ddriven;

import org.testng.annotations.Test;

import basepkg_ddriven.Baseclass;
import pagepkg_ddriven.Fbpage;
import utilitiespkg_ddriven.Excelutil;

public class Fbtest extends Baseclass{
	@Test
	public void verifyLoginWithValidCred()
	{
		Fbpage p1=new Fbpage(driver);
		String x2="C:\\Users\\HP\\OneDrive\\Desktop\\LUMINAR\\datadriven.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(x2,Sheet);
		
		for(int i=1;i<=rowCount;i++) {
			String UserName=Excelutil.getCellValue(x2,Sheet,i,0);
			System.out.println("username" +UserName);
			String Pwd=Excelutil.getCellValue(x2,Sheet,i,1);
			System.out.println("password" +Pwd);
			
			p1.setvalues(UserName, Pwd);
			p1.login();
			
		}
		
		
		
		
	}
	

}
