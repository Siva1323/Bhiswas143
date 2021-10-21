package xpath_HYR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Absolute_Relative_Xpath {
	WebDriver driver;
  @Test
  public  void xpath() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/");
	  
	  //Absolute 
	 // findElement(By.xpath("/html/body/div[3]/a[4]"));
	  
	  
	  //Relative
	  //findElement(By.xpath("//a[title()'Exercises']"));
	  
	  
	  //attributes
	 // findElement(By.xpath("//a[@id='w3loginbtn']")).click();
	 findElement(By.xpath("//a[@title='Search W3Schools']")).click();
	  
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

