package day3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login1 {
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
		System.out.println();
	}
	@Test(priority=1,description="rtgs")
	public void rtgs() {
		System.out.println("rtgs");
	}
	@Test(priority=3,description="neft")
	public void neft() {
		System.out.println("neft");
	}
	@Test(priority=1,description="imps")
	public void imps() {
		System.out.println("imps");
	}
}
