package leafground;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	@Test
	public void winds() throws Exception {
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		Thread.sleep(3000);
		String parentwindow = driver.getWindowHandle();
		System.out.println("parentwindow :"+parentwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Set<String> childwindow2 = driver.getWindowHandles();
		System.out.println(childwindow2.size());
		Iterator<String> ch2 = childwindow2.iterator();
		while(ch2.hasNext())
		{
			String tit = driver.switchTo().window(ch2.next()).getTitle();
			if(tit.equalsIgnoreCase("TestLeaf - Selenium Playground"))
				driver.close();
		}
		Thread.sleep(5000);
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//*[@id='color'][1]")).click();
		Thread.sleep(3000);
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow.size());
		for(String string : childwindow) {
			System.out.println(driver.switchTo().window(string).getTitle());
			if(driver.switchTo().window(string).getTitle().equalsIgnoreCase("TestLeaf - Interact with Buttons"))
			{
				Thread.sleep(3000);
				driver.manage().window().maximize();
				WebElement post=driver.findElement(By.xpath("//*[@id='position']"));
				System.out.println(post.getLocation().getX());
				System.out.println(post.getLocation().getY());
				Thread.sleep(3000);
				break;
			}else {
				Thread.sleep(3000);
				driver.manage().window().maximize();
				//driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//button[@id='color'][2]")).click();
		Set<String>childwindow1=driver.getWindowHandles();
		Iterator<String> ch = childwindow1.iterator();
		System.out.println("parent wind: "+ch.next());
		System.out.println("child wind1: "+ch.next());
		System.out.println("child wind2: "+ch.next());


	}

}
