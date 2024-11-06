package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement Frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(Frame1);
		driver.findElement(By.name("mytext1")).sendKeys("i am groot");
		
		driver.switchTo().defaultContent();
		
		WebElement Frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(Frame2);
        driver.findElement(By.name("mytext2")).sendKeys("iam leon");
        
        driver.switchTo().defaultContent();
        
        WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.name("mytext3")).sendKeys("i am rohith");
        
        driver.switchTo().frame(0);
        
        driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"i19\"]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"i22\"]/div[2]")).click();
        
        driver.switchTo().defaultContent();
        
        WebElement frame4=driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.name("mytext4")).sendKeys(" iam groot");
        
        
        
        
        
	}

}
