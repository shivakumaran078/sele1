package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {
	@Test
	public void radiobuttons() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='myradio'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@name='news'])[1]")).click();
		Thread.sleep(3000);
		int a=25;
		while(a>21)
		{
			System.out.println("my age is 19");
			driver.findElement(By.xpath("(//*[@class=\"large-6 small-12 columns\"])[3]/input[1]")).click();
			break;
		}
		while(a>21) {


			System.out.println("my age is 41");
			driver.findElement(By.xpath("(//*[@class=\"large-6 small-12 columns\"])[3]/input[3]")).click();
			break;


		}

	}

}
