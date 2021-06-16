package lanching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class launchinchrome1 
{
	@Test
	public void m2() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kumaran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.className("adult-infant-child")).click();


	}


}
