package leafground;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sortablew {
@Test
public void m2() throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/sortable.html");
List<WebElement> nos = driver.findElements(By.xpath("//*[@id='mydiv']/ul/li"));
int count = nos.size();
System.out.println(count);
Thread.sleep(5000);
WebElement from = nos.get(4);
WebElement to=nos.get(2);
Actions action = new Actions(driver);
action.clickAndHold(from).pause(3000).moveToElement(to).pause(3000);
action.release(to).build().perform();
//action.dragAndDrop(no.get(1),no.get(5)).bulid().perform();



}
}