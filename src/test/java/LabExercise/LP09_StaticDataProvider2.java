package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LP09_StaticDataProvider2 {
	
	WebDriver driver;
	
	//String Username="Admin", Password="admin123";
	//String jobTitle="Network Engineer22";
	//String URL="https://opensource-demo.orangehrmlive.com/" ;
	
	@DataProvider(name = "Siva2")
	 
	  public static Object[] myDataProvider() throws Exception{
		
		Object data[][]= new Object[3][4];
		
		 data[0][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[0][1]= "Admin";
	     data[0][2]= "admin123";
	     data[0][3]= "HW131";
	      

	     data[1][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[1][1]= "Admin";
	     data[1][2]= "admin123";
	     data[1][3]= "HW132";
	     
	     
	     data[2][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[2][1]= "Admin";
	     data[2][2]= "admin123";
	     data[2][3]= "HW133";
	     
	     return data;
	      

	}
				
	  @Test (dataProvider="Siva2") 
	  public void LoginTest(String URL,String UserName1, String Password1, String JobTitle1)throws Exception
	  {
		 
	  LP09_StaticDataProvider2 BS1=new LP09_StaticDataProvider2();
	  
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

		  
		  
	



