package lanching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class lanchingchrome {

	@SuppressWarnings("unused")
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kumaran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kumaran\\Downloads\\geckodriver-v0.29.1-win32");
	
		//FirefoxDriver driver = new FirefoxDriver() ;
		//WebDriver driver=new FirefoxDriver();


	}
}

