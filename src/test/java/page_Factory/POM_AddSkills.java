package page_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class POM_AddSkills {
	WebDriver driver;
  
  public POM_AddSkills (WebDriver driver) {
	  this.driver=driver;
  }
  public void Skills() throws Exception {
	  findElement(By.id("menu_admin_viewAdminModule")).click();
	  findElement(By.id("menu_admin_Qualifications")).click();
	  findElement(By.id("menu_admin_viewSkills")).click();
	  findElement(By.id("btnAdd")).click();
	  Thread.sleep(3000);
	  findElement(By.name("skill[name]")).sendKeys("Testing200");
	  findElement(By.id("btnSave")).click();
	  Thread.sleep(3000);
	  
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

