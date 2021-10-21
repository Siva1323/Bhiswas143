package lab3_ParalalTesting_Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

		
public class LP01_OpenBrowser {
	WebDriver driver;
  @Test
  public void test2() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
//      System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
//		driver =new ChromeDriver();
//		driver.manage().window().maximize();	
//		driver.get("https://www.google.com/");
	  
  }
}
