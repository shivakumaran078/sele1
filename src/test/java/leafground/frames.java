package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	@Test
	public void frames1() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.html']")));
		Thread.sleep(3000);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@src='page.html']")));
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//*[@id=\"Click1\"]")).click();
		driver.switchTo().defaultContent();
		//System.out.println(driver.findElement(By.xpath("//iframe")).size());
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		Thread.sleep(5000);
		driver.quit();


	}

}
