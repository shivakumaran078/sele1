package day3;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class orderoftestn {
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority=1,description="rtgs")
	public void rtgs()
	{
		System.out.println("rtgs");
	}
	@Test(priority=3,description="neft")
	public void neft()
	{
		System.out.println("neft");
	}

	@Test(priority=2)
	public void imps()
	{
		System.out.println("imps");
	}
}

