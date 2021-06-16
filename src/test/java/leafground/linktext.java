package leafground;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linktext {
	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Link.html");
		WebElement goHpage = driver.findElement(By.linkText("Go to Home Page"));
		Thread.sleep(3000);
		goHpage.click();
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement pageRedir = driver.findElement(By.partialLinkText("Find where am supposed to"));
		System.out.println(pageRedir.getAttribute("href"));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("404"))
			System.out.println("my page is broken");
		else 
			System.out.println("page is not broken");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Go to Home Page'])[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		List<WebElement> noLinks=driver.findElements(By.tagName("a"));
		System.out.println(noLinks.size());
		for(WebElement webElement : noLinks)
		{
			System.out.println(webElement.getAttribute("href"));
		}

		Thread.sleep(10000);
		driver.quit();


	}
}
