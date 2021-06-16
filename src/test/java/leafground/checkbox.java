package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {
	@Test
	public void checkboxes() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		System.out.println(driver.getTitle());
		WebElement checkjava=driver.findElement(By.xpath("//*[@type='checkbox'][1]"));
		Thread.sleep(3000);
		System.out.println("java is Checked?: "+checkjava.isSelected());
		Thread.sleep(3000);
		checkjava.click();
		Thread.sleep(3000);
		System.out.println("java is Checked?: "+checkjava.isSelected());
		Thread.sleep(3000);
		WebElement Deselect = driver.findElement(By.xpath("//*[@type='checkbox'][8]"));
		Thread.sleep(3000);
		System.out.println("Deslect is checked?: " +Deselect.isSelected());
		Thread.sleep(3000);
		Deselect.click();
		Thread.sleep(3000);
		System.out.println("Deslect is checked?: " +Deselect.isSelected());
		List<WebElement> count = driver.findElements(By.xpath("//*[@class='example'][4]/div/input"));
		int si=count.size();
		for(WebElement webElement : count) {
			WebElement.click();
			Thread.sleep(3000);
		}

		for(int i = 0 ; i<si; i++) {
			Thread.sleep(3000);
			count.get(i).click();

		}
	}


}
