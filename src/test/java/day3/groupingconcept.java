package day3;

import org.testng.annotations.Test;

public class groupingconcept {
	@Test
	public void login51()
	{
		System.out.println("login51");
		
	}
	@Test(groups ={"phone"},dependsOnMethods = "login51")
	public void logout51()
	{
		System.out.println("logout51");
		
	}
	@Test(groups= {"phone"},dependsOnMethods = "login51")
	public void samsungphone()
	{
		System.out.println("samsungphone");
		
	}
	@Test(groups={"phone"},dependsOnMethods = "login51")
	public void htcphone()
	{
		System.out.println("htc phone");
		
	}
	@Test(groups={"phone"},dependsOnMethods = "login51")
	public void applephone()
	{
		System.out.println("apple phone");
		
	}
	
	}

