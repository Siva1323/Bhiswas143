package page_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	  		  PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(id="menu_admin_viewAdminModule")
	  WebElement Admin;
	  @FindBy(id="menu_admin_Job")
	  WebElement job;
	  @FindBy(id="menu_admin_viewJobTitleList")
	  WebElement Title;
	  @FindBy(id="btnAdd")
	  WebElement Add;
	  @FindBy(name="jobTitle_jobTitle")
	  WebElement JobTitle;
	  @FindBy(id="btnSave")
	  WebElement Save;
	  
	  public void Addjobs()throws Exception{
		  
		  Admin.click();
		  job.click();
		  Title.click();
		  Add.click();
		  JobTitle.sendKeys("Testing252");
		  Save.click();
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
	



