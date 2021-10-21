package Bhiswas11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1_OpenBrowser {
	
	WebDriver Driver;
	
  @Test
  public void OpenBrowser() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  Driver=new ChromeDriver();
	  Driver.manage().window().maximize();
	  String url="https://www.google.com";
	  Driver.get(url);
	  Driver.close();
	  
  }
}
