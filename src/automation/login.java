package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/v4/");
	driver.findElement(By.name("uid")).sendKeys("mngr571047");
	driver.findElement(By.name("password")).sendKeys("NUPNIICHAN089@");
	driver.findElement(By.name("btnLogin")).click();

	}

}
