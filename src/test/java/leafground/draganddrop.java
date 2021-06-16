package leafground;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	@Test
	public void draganddrops() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		//Action.dragAndDropBy(drag, 200, 150);
		//action.build();
		//action.perform();
		//action.clickAndHold(drag).moveToElement(drag, 200, 200);
		//action.perform();
		action.clickAndHold(drag).moveByOffset(300, 0).perform();
		Thread.sleep(3000);
		
		
		
		
	}

}