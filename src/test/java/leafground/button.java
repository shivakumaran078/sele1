package leafground;


import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class button {


	@Test
	public void buttons() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		@SuppressWarnings("unused")
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		Thread.sleep(3000);
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement post=driver.findElement(By.xpath("//*[@id='position']"));
		System.out.println(post.getLocation().getX());
		System.out.println(post.getLocation().getY());
		org.openqa.selenium.Point getXY =post.getLocation();
		System.out.println(getXY.x + " "+getXY.y);
		WebElement colour=driver.findElement(By.xpath("//*[@id='color']"));
		@SuppressWarnings("unused")
		String co=colour.getCssValue("background-colour");
		WebElement si=driver.findElement(By.xpath("//*[@id='size']"));
		System.out.println(si.getSize().getHeight());
		System.out.println(si.getSize().getWidth());
		org.openqa.selenium.Dimension d =si.getSize();
		System.out.println(d.getHeight()+" "+d.getWidth());
	}

}
