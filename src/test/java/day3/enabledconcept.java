package day3;

import org.testng.annotations.Test;

public class enabledconcept {
	@Test(dependsOnMethods = "enabledconcept2")
	public void enabledconcept1()
	{
		System.out.println("enabled concept 1");
	}
	@Test(dependsOnMethods = "enabledconcept3")
	public void enabledconcept2()
	{
		System.out.println("enabled concept 2");
	}
	@Test
	public void enabledconcept3()
	{
		System.out.println("enabled concept 3");
	}

}
