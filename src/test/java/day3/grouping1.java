package day3;

import org.testng.annotations.Test;

public class grouping1 {
	@Test(groups={"headset"})
	public void jblheadset()
	{
		System.out.println("jblheadset");
	}
	@Test(groups= {"headset"})
	public void boatheadset()
	{
		System.out.println("boatheadset");
	}

	@Test(groups= {"headset"})
	public void skullcandy()
	{
		System.out.println("skullcandy");
	}

	@Test(groups= {"phone"})
	public void samsungphone()
	{
		System.out.println("samsungphone");
	}

	@Test(groups= {"phone"})
	public void applephone()
	{
		System.out.println("applephone");
	}

	@Test(groups= {"grocery"})
	public void grocery1()
	{
		System.out.println("grocery1");
	}

	@Test(groups= {"grocery"})
	public void grocery2()
	{
		System.out.println("grocery2");
	}

	@Test(groups= {"grocery"})
	public void grocery3()
	{
		System.out.println("grocery3");
	}

}
