package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop {
	
	static WebDriver driver;
	
  @Test
 
  public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	
	WebElement Source_Drag_Button=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	Thread.sleep(3000);
	WebElement Target_Drag_Button=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	
			
	Actions actions = new Actions(driver);
	actions.dragAndDrop(Source_Drag_Button, Target_Drag_Button).perform();
}
}
