package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Hover_Actions {
	WebDriver driver;
  @Test
  public void Actions() throws Exception {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.hyrtutorials.com/");
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 WebElement TUTORIALS = findElement(By.linkText("Tutorials"));
	 WebElement DOTNET = findElement(By.linkText("Dot Net"));
	 WebElement SQL = findElement(By.linkText("SQL"));
	 WebElement JAVA = findElement(By.linkText("Java"));
			 
	 Actions action = new Actions(driver);
	 
	 action.moveToElement(TUTORIALS).
	 moveToElement(DOTNET).
	 moveToElement(SQL).
	 moveToElement(JAVA).click().build().perform();
			 
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


