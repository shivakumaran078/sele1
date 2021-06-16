package day3;

import org.testng.annotations.Test;

public class dependsonmethod {
	@Test
	public void login2()
	{
		System.out.println("login2");
	}
	@Test(dependsOnMethods = "function21")
	public void logout2()
	{
		System.out.println("logout2");
	}
	@Test(dependsOnMethods = "login2")
	public void function21()
	{
		System.out.println("function 2 1");
	}
	@Test(dependsOnMethods = "login2")
	public void function22()
	{
		System.out.println("function 2 2");
	}
}