package lanching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class crome3 {
	@Test
	public void m4()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kumaran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		@SuppressWarnings("unused")
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("(//input[contains(@name,'txt')])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[contains(@name,'txt')])[2]")).sendKeys("admin123");
		//driver.findElement(By.xpath("(//input[@id=\"txtpassword\"]")).sendKeys("friday");
		driver.findElement(By.xpath("//*[@value=\"LOGIN\"]")).click();

	}

}
