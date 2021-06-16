package day3;


import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut=7000)
	public void function41() throws Exception

	{
		System.out.println("function 4 1");
		Thread.sleep(10000);
	}


}
