package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LP02_Addjobs {
	
	WebDriver driver;
	 
	
	  @Test
	  public void test1() throws Exception 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		  driver.findElement(By.id("menu_admin_Job")).click();
		  driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		  driver.findElement(By.id("btnAdd")).click();
		  driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Networking Engineer17");
		  driver.findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAdd")).click();
		  driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Hardware Engineer17"); 
		  driver.findElement(By.id("btnSave")).click();
	  }

		  
		  }
	



