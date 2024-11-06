package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class checkboX {

public static void main(String[] args) {
		
         WebDriver driver=new EdgeDriver();
         driver.get("https://demo.guru99.com/test/radio.html");
         driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
         
	}

}
