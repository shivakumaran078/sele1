package demoqa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import leafground.alert;

public class button {
	@Test
	public void buttons() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(link);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnElement).perform();
		System.out.println("right click context menu displayed");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[3]")).click();

		driver.close();



	}

}
