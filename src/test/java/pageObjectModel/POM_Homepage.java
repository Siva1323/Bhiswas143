package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class POM_Homepage {
	WebDriver driver;
	
	
 
  public POM_Homepage(WebDriver driver) {
	  this.driver = driver;
  }
  public void Logout() throws Exception{
	  findElement(By.id("welcome")).click();
	  Thread.sleep(3000);
	  findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	  
  }
  
  public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
}
