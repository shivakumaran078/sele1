package day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class login4 {
	@Test
	public void login() {
		System.out.println("login before Assert");
		Assert.assertTrue(false);
		System.out.println("login after Assert");
	}
	@Test(dependsOnMethods = "fun",alwaysRun =true)
	public void logout() {
		System.out.println("logout");
	}
	@Test(dependsOnMethods = "login",alwaysRun = true)
	public void fun()
	{
		System.out.println("fun");
		Assert.fail();
	}

}
