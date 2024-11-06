package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class radiobuttuns {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label")).click();
		
	

	}

}
       