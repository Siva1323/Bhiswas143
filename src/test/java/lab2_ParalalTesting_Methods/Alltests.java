package lab2_ParalalTesting_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtil.OR;
import CommonUtil.TestBrowser;

public class Alltests {
	WebDriver driver;


		@Test
	
	  public void test1() 
		{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		}
		 @Test
		  public void Add_jobs_Test() throws Exception  {
			  
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				
				
				driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				driver.findElement(By.id("menu_admin_Job")).click();
				driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
				driver.findElement(By.id("btnAdd")).click();
				driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales6");
				driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales6 desr");
				driver.findElement(By.id("jobTitle_note")).sendKeys("Sales6 Note");
				driver.findElement(By.id("btnSave")).click();
				
		  }
		 @Test
			public void Open_Mercury() throws Exception {
				
				//OpenChromeVrowser
				driver = TestBrowser.OpenChromeBrowser();
				
				//OpenUrl
				driver.get("http://newtours.demoaut.com/");

				//SendKeys
				driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
				driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
				
				//Close Browser		
				driver.quit();
			}
}	  

