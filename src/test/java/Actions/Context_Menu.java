package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Context_Menu {
	static WebDriver driver;

  @Test
  public void DoubleClick() throws Exception {
	  		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement RButton =driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(RButton).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		driver.findElement(By.xpath("//span[text()='Quit']")).click();
		
	    Alert alert = driver.switchTo().alert();
	    
	    Thread.sleep(1000);
	    
	    alert.accept();
	    
  }
		
		
  }

