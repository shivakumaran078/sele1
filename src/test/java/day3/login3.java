package day3;

import org.testng.annotations.Test;

public class login3{
	@Test
	public void login4() {
		System.out.println("login4");
	}
	@Test(dependsOnMethods={"function31","function32"})
	public void logout4()
	{
		System.out.println("logout4");
	}
	@Test(dependsOnMethods = "login4")
	public void function31()
	{
		System.out.println("function 3 1");
	}
	@Test(dependsOnMethods="login4")
	public void function32()
	{
		System.out.println("function 3 2");
	}
}
