package Bhiswas11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC01_Locators {
	
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
  public void Add_jobs_Test() throws Exception  {
	  
		System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.id("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.cssSelector("#btnLogin")).click();
		
		
		findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		findElement(By.id("menu_admin_Job")).click();
		Thread.sleep(3000);
		findElement(By.xpath("//a[@id='menu_admin_jobCategory']")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.xpath("//input[@id='jobCategory_name']")).sendKeys("IT Hardware");
		findElement(By.cssSelector("#btnSave")).click();
		
		
  }
  
  
}
