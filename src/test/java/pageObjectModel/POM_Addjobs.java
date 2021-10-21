package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM_Addjobs {
	
	WebDriver driver;
	
		 
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	
	}
	
	 
	  public POM_Addjobs(WebDriver driver) throws Exception {
	  		  this.driver = driver;
	  }
	  public void AddJobs() throws Exception {
		  findElement(By.id("menu_admin_viewAdminModule")).click();
		  findElement(By.id("menu_admin_Job")).click();
		  findElement(By.id("menu_admin_viewJobTitleList")).click();
		  findElement(By.id("btnAdd")).click();
		  Thread.sleep(3000);
		  findElement(By.id("jobTitle_jobTitle")).sendKeys("Networking Engineer5617");
		  findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  
	  }

		  
		  }
	



