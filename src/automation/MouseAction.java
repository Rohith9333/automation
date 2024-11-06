package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		Actions Act=new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement Right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Act.contextClick(Right).perform();
		
	    driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]")).click();
	    driver.switchTo().alert().accept();
	    
	    WebElement Doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	    
	    Act.doubleClick(Doubleclick).perform();
	    
	    driver.switchTo().alert().accept();
       
	    driver.close();
	}

}
