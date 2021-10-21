package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Doubleclick {
	
	static WebDriver driver;
  @Test
  public void Actions() throws Exception {
	  System.setProperty("Webdriver.chrome.driver",("C:\\chromedriver_win32\\chromedriver.exe"));
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://testautomationpractice.blogspot.com/");
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 WebElement Click = findElement(By.xpath("//*[@id=\'HTML10\']/div[1]/button"));
	 Actions action=new Actions(driver);
	 action.doubleClick(Click).perform();
	
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

