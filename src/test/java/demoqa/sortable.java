package demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sortable {
	@Test
	public void m3() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.demoqa.com/sortable");
		List<WebElement> e1=driver.findElements(By.xpath("//*[@class='vertical-list-container mt-4']/div"));
		Actions action =new Actions(driver);
		action.dragAndDrop(e1.get(1),e1.get(4)).build().perform();
		Thread.sleep(5000);
		driver.quit();


	}


}
