package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction 
 {
public static void main(String[] args) 
 {
	 WebDriver driver=new EdgeDriver();
	 driver.get("https://text-compare.com/");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.name("text1")).sendKeys("I love Jesus");
	 
	 Actions act=new Actions(driver);
	 
	 act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	 act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

	 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	 
	 driver.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]")).click();
	}
}
