package leafground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectable {
	@Test
	public void selectables() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> se = driver.findElements(By.id("//*[@id=\"selectable\"]/li"));
		System.out.println(se.size());
		Actions ac = new Actions(driver);
		/*	
		ac.keyDown(Keys.CONTROL);
		ac.click(se.get(1)).pause(Duration.ofSeconds(5));
		ac.click(se.get(3)).pause(3000);
		ac.click(se.get(5)).pause(3000);
		ac.click(se.get(0)).pause(3000);
		ac.click(se.get(2)).pause(3000);
		ac.click(se.get(4)).pause(3000);
		 */
		ac.click(se.get(1)).pause(3000);
		ac.click(se.get(3)).pause(3000);
		ac.click(se.get(5)).pause(3000);
		ac.clickAndHold(se.get(1)).pause(5900);
		ac.clickAndHold(se.get(3)).pause(5900);
		ac.clickAndHold(se.get(5)).pause(5900);

		ac.build().perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
