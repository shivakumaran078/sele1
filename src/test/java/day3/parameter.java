package day3;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	@Parameters({"testing1","testing2"})
	@Test
	public void m1(@Optional("edge") String browser,@Optional("firefox")String test) {
		System.out.println("m1");
		System.out.println(browser);
		System.out.println(test);
	}
}
