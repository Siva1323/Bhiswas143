package Bhiswas11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
public class Dropdown {
	
	WebDriver driver;
	
  @Test
  public void Test1() throws Exception {
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//driver =new ChromeDriver();
		//driver.manage().window().maximize() ;	
	  
	  	driver=TestBrowser.OpenChromeBrowser();
	  	
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL); 
	  
		//driver = TestBrowser.OpenChromeBrowser();
	  
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("Organization")).click();
		driver.findElement(By.linkText("Locations")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		Select dropdown1 = new Select(driver.findElement(By.id("location_country")));
		//dropdown1.selectByValue("IN"); 
		//dropdown1.selectByVisibleText("India");
		//dropdown1.selectByIndex(5);
		
		 
		List<WebElement> elements=dropdown1.getOptions();
		 for(WebElement element:elements)
		 {
			 System.out.println(element.getText());
			 
}
  }
}