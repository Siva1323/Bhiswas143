package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Bhiswas11.Browser_Login;
import ExcelUtil.ExcelApiTest4;


public class LP11_StaticDataProvider_BrowserCompatabulity4 {
	
	WebDriver driver;
	
	//String Username="Admin", Password="admin123";
	//String jobTitle="Network Engineer22";
	//String URL="https://opensource-demo.orangehrmlive.com/" ;
	
	@DataProvider(name = "Siva4")
	 
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("D://Siva4.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);

	}
				
	  @Test (dataProvider="Siva4") 
	  public void LoginTest(String Browser,String URL1,String UserName1, String Password1, String JobTitle1)throws Exception
	  {
		 
	  LP11_StaticDataProvider_BrowserCompatabulity4 BS1=new LP11_StaticDataProvider_BrowserCompatabulity4();
	  
	  if(Browser.equalsIgnoreCase("Chrome"))
		
	  {
			BS1.OpenChromeBrowser();
		  BS1.OpenOrangeHRM(URL1);
		  BS1.Login(UserName1,Password1);
		  BS1.Add_job_Title(JobTitle1);
		  BS1.CloseBrowser();  
	  }
			
	  if(Browser.equalsIgnoreCase("FireFox"))
	  {
			BS1.FireFoxBrowser();
			
		  BS1.OpenOrangeHRM(URL1);
		  Thread.sleep(3000);
		  BS1.Login(UserName1,Password1);
		  Thread.sleep(3000);
		  BS1.Add_job_Title(JobTitle1);
		  BS1.CloseBrowser();  
	  }
		
	  //BS1.OpenChromeBrowser();
	 
	  }
	  
	
	public void OpenChromeBrowser()throws Exception
	 	{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	 	}
	   
		public  void FireFoxBrowser() throws Exception
		{
		 System.setProperty("webdriver.gecko.driver","C:\\FireFoxDriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 Thread.sleep(6000);
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

		  
		  
	



