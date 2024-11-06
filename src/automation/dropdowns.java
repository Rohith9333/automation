package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		
		Select title=new 
		Select(driver.findElement(By.name("title")));
		
	    title.selectByIndex(8);                      //index method start with (0,1,2,3,4)
		title.selectByValue("Doctor");               //value method
		title.selectByVisibleText("Lieutenant");     //visibleText method
		
		driver.findElement(By.id("user_firstname")).sendKeys("Rohith kumar");
		driver.findElement(By.id("user_surname")).sendKeys("Gajula");
		driver.findElement(By.id("user_phone")).sendKeys("8688117110");
		
		Select title1=new
	    Select(driver.findElement(By.name("year")));
		title1.selectByValue("1995");
		
		Select title2=new
		Select(driver.findElement(By.name("month")));
	    title2.selectByVisibleText("November");
		
		Select title3=new
		Select(driver.findElement(By.name("date")));
		title3.selectByValue("21");
		
		driver.findElement(By.xpath("//*[@id=\"licencetype_f\"]")).click();
        
		Select title4=new
		Select(driver.findElement(By.xpath("//*[@id=\"user_licenceperiod\"]")));
		title4.selectByValue("5");
		
		Select title5=new
		Select(driver.findElement(By.name("occupation")));
		title5.selectByValue("6");
		
		driver.findElement(By.name("street")).sendKeys("madhura nagar");
		driver.findElement(By.name("city")).sendKeys("hyderbad");
		driver.findElement(By.name("county")).sendKeys("India");
		
		driver.findElement(By.name("post_code")).sendKeys("5000033");
		driver.findElement(By.name("email")).sendKeys("Rohithkumar933@gmail.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Rohith@1");
		driver.findElement(By.name("c_password")).sendKeys("Rohith@1");
		
		driver.findElement(By.name("submit")).click();
		
		
		driver.findElement(By.name("email")).sendKeys("Rohithkumar933@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rohith@1");
		
		driver.findElement(By.name("submit")).click();
		
		driver.close();
		
		
	}  

}
     
      
      