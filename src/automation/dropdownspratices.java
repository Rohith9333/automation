package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownspratices {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		
		Select title=new Select(driver.findElement(By.name("title")));
		title.selectByValue("Doctor");
		
		driver.findElement(By.name("firstname")).sendKeys("rohith");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("phone")).sendKeys("8688117110");
		
		Select title1=new Select(driver.findElement(By.name("year")));
		title1.selectByVisibleText("1995");
		
		Select title2=new Select(driver.findElement(By.name("month")));
		title2.selectByVisibleText("November");
		
		Select title3=new Select(driver.findElement(By.name("date")));
		title3.selectByVisibleText("21");
		
		
	}

}
