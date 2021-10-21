package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LP02b_Addjobs {
	
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
	
	  @Test
	  public void test1() throws Exception 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  findElement(By.id("txtUsername")).sendKeys("Admin");
		  findElement(By.id("txtPassword")).sendKeys("admin123");
		  findElement(By.id("btnLogin")).click();
		  findElement(By.id("menu_admin_viewAdminModule")).click();
		  findElement(By.id("menu_admin_Job")).click();
		  findElement(By.id("menu_admin_viewJobTitleList")).click();
		  findElement(By.id("btnAdd")).click();
		  findElement(By.id("jobTitle_jobTitle")).sendKeys("Networking Engineer17");
		  findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  findElement(By.id("btnAdd")).click();
		  findElement(By.id("jobTitle_jobTitle")).sendKeys("Hardware Engineer17"); 
		  findElement(By.id("btnSave")).click();
	  }

		  
		  }
	



