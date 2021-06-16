package lanching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchingchrome {
@SuppressWarnings("unused")
@Test
public void launchingchrome1()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kumaran\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}

}
