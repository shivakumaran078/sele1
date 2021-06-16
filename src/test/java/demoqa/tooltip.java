package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class tooltip {
	public void tooltips() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement ageTextBox = driver.findElement(By.id("age"));
		String tooltipText = ageTextBox.getAttribute("title"); 
		System.out.println("Retrieved tooltip text as :"+tooltipText); 
		if(tooltipText.equalsIgnoreCase("We ask for your age only for statistical purposes."))
		{ 
			System.out.println("Pass : Tooltip matching expected value");
		}
		else
		{ 
			System.out.println("Fail : Tooltip NOT matching expected value"); 
		} 
		driver.close(); 

		Thread.sleep(3000);
	}


}
