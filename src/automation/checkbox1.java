package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkbox1 {

	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
	    driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> check=driver.findElements(By.xpath("\"//*[@type='checkbox']\""));
		
	    System.out.println(check.size());
		                          
	    //  (initi +         condu +        increm) ===== for loops
		for(int i=0;     i<check.size();      i++)  
	{
		 check.get(i).click();
	}
  }
}
