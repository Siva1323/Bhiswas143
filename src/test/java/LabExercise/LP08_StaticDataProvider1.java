package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LP08_StaticDataProvider1 {
	
	WebDriver driver;
	
	//String Username="Admin", Password="admin123";
	//String jobTitle="Network Engineer22";
	//String URL="https://opensource-demo.orangehrmlive.com/" ;
	
	@DataProvider(name = "Siva1")
	 
	  public static Object[][] Test1() throws Exception{
		  return new Object[][] 	 {
	  {"https://opensource-demo.orangehrmlive.com/","Admin","admin123","Hardware14"},
	  {"https://opensource-demo.orangehrmlive.com/","Admin","admin123","Hardware15"},
	  {"https://opensource-demo.orangehrmlive.com/","Admin","admin123","Hardware16"},
		  };
	  }
	  @Test (dataProvider="Siva1") 
	  public void LoginTest(String URL,String UserName1, String Password1, String JobTitle1)throws Exception
	  {
		 
	  LP08_StaticDataProvider1 BS1=new LP08_StaticDataProvider1();
	  
	  BS1.OpenChromeBrowser();
	  BS1.OpenOrangeHRM(URL);
	  BS1.Login(UserName1,Password1);
	  BS1.Add_job_Title(JobTitle1);
	  BS1.CloseBrowser();
	  }
	  
	
	public void OpenChromeBrowser()throws Exception
	 	{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	 	}
	   
		  public void OpenOrangeHRM(String URL)throws Exception
		  {
		  driver.get(URL);
		  }
		  
		  public void Login(String Username, String Password)throws Exception
		  {
		  findElement(By.id("txtUsername")).sendKeys(Username);
		  findElement(By.id("txtPassword")).sendKeys(Password);
		  findElement(By.id("btnLogin")).click();
		  }
		  
		  public void Add_job_Title(String JobTitle)throws Exception
		  {
		  findElement(By.id("menu_admin_viewAdminModule")).click();
		  findElement(By.id("menu_admin_Job")).click();
		  findElement(By.id("menu_admin_viewJobTitleList")).click();
		  findElement(By.id("btnAdd")).click();
		  findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle);
		  findElement(By.id("btnSave")).click();
		  }
		  
		  public void CloseBrowser()throws Exception
		  {
		   driver.quit();
		  }
		  		  
		  


		  public  WebElement findElement(By by) throws Exception 
			{

				WebElement elem = driver.findElement(by);  
				
			if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			 
			}
				return elem;
			}

		  
			
		  }

		  
		  
	



