package lanching;

import java.awt.List;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome2 {


	@Test
	public void m3() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kumaran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("testingusername");
		WebElement password=driver.findElement(By.className("password"));
		 password.sendKeys("testing123");
		 
		//driver.findElement(By.linkText("START MY FREE TRIAL")).click();

		//driver.findElement(By.partialLinkText("SPICE")).click();
		//List<WebElement> links = driver.findElement(By.tagName("a"));

	}

}
