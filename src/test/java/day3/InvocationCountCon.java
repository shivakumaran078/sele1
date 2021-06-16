package day3;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerExamples.class)
public class InvocationCountCon {
	int i=0;
	@Test(successPercentage=60,invocationCount=10)
	public void m1()throws Exception
	{
		Assert.fail();

	}
	@Test()
	public void m2()
	{
		System.out.println("method 2 output");
	}
	@Test
	public void m3()
	{
		System.out.println("before skip Exception");
		throw new SkipException("Exception message");
	}
	@Test
	public void m4()
	{
		Assert.fail();

	}
}
