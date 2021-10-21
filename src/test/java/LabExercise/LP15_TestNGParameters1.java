package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import CommonUtil.TestBrowser;

public class LP15_TestNGParameters1 {
	
		static WebDriver driver;
		
	  @Parameters({"Browser1","UserName1","Password1","JobTitle1"})
	  @Test
	  public static void TestNG_Login(String Browser,String UserName,String Password, String JobTitle) throws Exception
	  
	  {
	  if(Browser.equalsIgnoreCase("Chrome"))
		{
			
		    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 	driver =new ChromeDriver();
	 	 	driver.manage().window().maximize() ;	
	    }

		if(Browser.equalsIgnoreCase("FireFox"))
		{
				driver = TestBrowser.OpenFirefoxBrowser();
				Thread.sleep(5000);
		}
		
	  
	  //LP15_TestNGParameters1.OpenChromeBrowser();
	  LP15_TestNGParameters1.OpenOrangeHRM();
	  LP15_TestNGParameters1.Login(UserName,Password);
	  LP15_TestNGParameters1.Add_job_Title(JobTitle);
	  
	  
	  driver.quit();
	  
	  }

	  public static void OpenOrangeHRM()throws Exception
	  {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	  
	  	public static void OpenChromeBrowser()throws Exception
	 	{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	 	}
	   
		 
		  public static void Login(String UserName2,String Password2)throws Exception
		  {
		  findElement(By.id("txtUsername")).sendKeys(UserName2);
		  findElement(By.id("txtPassword")).sendKeys(Password2);
		  findElement(By.id("btnLogin")).click();
		  }
		  
		  public static void Add_job_Title(String JobTitle2)throws Exception
		  {
		  findElement(By.id("menu_admin_viewAdminModule")).click();
		  Thread.sleep(5000);
		  findElement(By.id("menu_admin_Job")).click();
		  findElement(By.id("menu_admin_viewJobTitleList")).click();
		  findElement(By.id("btnAdd")).click();
		  findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle2);
		  findElement(By.id("btnSave")).click();
		  }
		  			  		  

		  


		  public static  WebElement findElement(By by) throws Exception 
			{

				WebElement elem = driver.findElement(by);  
				
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
				}
				return elem;
			}

		  
		  }	
	  	

		  
		  
	



