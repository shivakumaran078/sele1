package day3;

import org.testng.annotations.Test;

public class invocationCount {
@Test(invocationCount = 10,invocationTimeOut = 11000)
public void m1() throws Exception
{
	System.out.println("method 1 output");
}
@Test()
public void m2()
{
	System.out.println("method 2 output");
}
}
