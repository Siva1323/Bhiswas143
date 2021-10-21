package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LP07_Locaters {
	
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
		  
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.className("button")).click();
		  driver.findElement(By.linkText("Admin")).click();
		  driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']")).click();
		  driver.findElement(By.cssSelector("#menu_admin_viewJobTitleList")).click();
		  driver.findElement(By.name("btnAdd")).click();
		  driver.findElement(By.cssSelector("input#jobTitle_jobTitle")).sendKeys("Networking Engineer11");
		  driver.findElement(By.xpath("//*[@id=\'btnSave\']")).click();
		  driver.quit();
	  }

		  
		  }
	



