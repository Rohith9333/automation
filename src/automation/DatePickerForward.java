package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
public class DatePickerForward {

	public static void main(String[] args)
	
	{
		
	WebDriver driver=new EdgeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	
	//string data type;
	
	String Date="21";
	String Month="November";
	String Year="2025";
	
	//while loop;
	
       while(true)
    {
    	String Mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
    	String yer=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
    	
       if(Mon.equals(Month) && yer.equals(Year))
    	
                          {   break;  }
    
         driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
     }
       
	     List<WebElement>Alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody"));
          
	     for(WebElement Dates:Alldates)
	    	 
    {   
	    	 if (Dates.getText().equals(Date))
	    
	          {  Dates.click(); }
    }   
   }
  }
     
    
    	
    
	


