package day3;

import org.testng.annotations.Test;

public class timeout1 {
	
		@Test(timeOut = 7000)
		
		public void function61()
		throws Exception{
			System.out.println("before function 61");
			Thread.sleep(6000);
			System.out.println("after function 61");
		}
		
	

}
