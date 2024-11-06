package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		Actions Act=new Actions(driver);
		
		                  driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement From = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to =   driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
		
       Act.dragAndDrop(From, to).perform();

	}

}
