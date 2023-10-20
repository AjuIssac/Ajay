package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	@BeforeTest
	
	public void setup() {
		System.out.println("browseropen");
	}
	
	@BeforeMethod
	public void urlloading() {
		System.out.println("urload");
	}
	
	@Test(priority=2,invocationCount=3)
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=3,enabled=false)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=1,dependsOnMethods= {"test1"})
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterMethod()
	public void report() {
		System.out.println("äftermethod");
	}
	
	@AfterTest
	public void browserclose() {
		System.out.println("browser close");
	}
		
	

}
