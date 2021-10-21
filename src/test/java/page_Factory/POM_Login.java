package page_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_Login {
	WebDriver driver;
	
  public  POM_Login(WebDriver driver) {
	  
	  this.driver = driver;
	 PageFactory.initElements(driver,this);
  }  
	 
  
	 @FindBy(id="txtUsername")
	 WebElement UserName1;
	 @FindBy(name="txtPassword")
	 WebElement Password1;
	 @FindBy(id="btnLogin")
	 WebElement Login1;
	 
	 
	 public void Login() throws Exception {
			
			UserName1.sendKeys("Admin");
			Password1.sendKeys("admin123");
			Login1.click();
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
