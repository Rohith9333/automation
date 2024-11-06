package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alets 
{

	public static void main(String[] args)
	{
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().accept();

	}

}
