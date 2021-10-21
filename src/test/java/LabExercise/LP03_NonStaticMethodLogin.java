package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LP03_NonStaticMethodLogin {
	
	WebDriver driver;
	
	
	  @Test
	  public void Nonstatic_Login() throws Exception
	  
	  {
		  
	  LP03_NonStaticMethodLogin BS1=new LP03_NonStaticMethodLogin();
	  
	  BS1.OpenChromeBrowser();
	  BS1.OpenOrangeHRM();
	  BS1.Login();
	  BS1.Add_job_Title();
	  BS1.CloseBrowser();
	  }
	  
	 public void OpenChromeBrowser()throws Exception
	 	{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	 	}
	   
		  public void OpenOrangeHRM()throws Exception
		  {
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  }
		  
		  public void Login()throws Exception
		  {
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		  }
		  
		  public void Add_job_Title()throws Exception
		  {
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		  driver.findElement(By.id("menu_admin_Job")).click();
		  driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		  driver.findElement(By.id("btnAdd")).click();
		  driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Networking Engineer15");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnSave")).click();
		  }
		  
		  public void CloseBrowser()throws Exception
		  {
			  Thread.sleep(3000);
			  driver.quit();
		  }
		  		  
}
		  


//		  public  WebElement findElement(By by) throws Exception 
//			{
//
//				WebElement elem = driver.findElement(by);  
//				
//				if (driver instanceof JavascriptExecutor) 
//				{
//				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
//			 
//				}
//				return elem;
//			}

		  
			
	  	

		  
		  
	



