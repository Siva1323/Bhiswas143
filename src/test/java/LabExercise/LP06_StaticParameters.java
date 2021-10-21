package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LP06_StaticParameters {
	
	static WebDriver driver;
	static String UserName="Admin", Password="admin123";
	static String jobTitle="Network Engineer22";
	
	 
	  @Test
	  public void StaticPara_Login() throws Exception
	  
	  {
	  LP06_StaticParameters.OpenChromeBrowser();
	  LP06_StaticParameters.OpenOrangeHRM();
	  LP06_StaticParameters.Login(UserName,Password);
	  LP06_StaticParameters.Add_job_Title(jobTitle);
	  LP06_StaticParameters.CloseBrowser();
	  }
	  


	  	public static void OpenChromeBrowser()throws Exception
	 	{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	 	}
	   
		  public static void OpenOrangeHRM()throws Exception
		  {
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  }
		  
		  public static void Login(String UserName2,String Password2)throws Exception
		  {
		  driver.findElement(By.id("txtUsername")).sendKeys(UserName2);
		  driver.findElement(By.id("txtPassword")).sendKeys(Password2);
		  driver.findElement(By.id("btnLogin")).click();
		  }
		  
		  public static void Add_job_Title(String JobTitle2)throws Exception
		  {
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		  driver.findElement(By.id("menu_admin_Job")).click();
		  driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		  driver.findElement(By.id("btnAdd")).click();
		  driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle2);
		  driver.findElement(By.id("btnSave")).click();
		  }
		  
		  public static void CloseBrowser()throws Exception
		  {
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

		  
			
	  	

		  
		  
	



