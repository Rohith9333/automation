package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CosomasAutomationPraticate {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
	    driver.get("https://cosmocode.io/automation-practice/");
	    
	    driver.findElement(By.id("firstname")).sendKeys("Rohith");
	    driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/input[2]")).sendKeys("kumar");
	    driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/input[4]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/input[6]")).click();
	    driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/input[7]")).click();
	    
	    Select title=new
	    Select(driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/select")));
	    title.selectByValue("20 to 29");
	    
	    driver.findElement(By.id("submit_htmlform")).click();
	    
	    

	}

}
