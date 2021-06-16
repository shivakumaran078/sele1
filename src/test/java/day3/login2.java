package day3;

import org.testng.annotations.Test;

public class login2 {
	@Test
	public void login2()
	{
		System.out.println("login2");

	}

	@Test(dependsOnMethods = "function21")
	public void logout2()
	{
		System.out.println("logout 2");

	}

	@Test(dependsOnMethods = "login2")
	public void function21()
	{
		System.out.println("function 2 1");

	}
}
