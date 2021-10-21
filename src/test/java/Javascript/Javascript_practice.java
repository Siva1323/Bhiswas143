package Javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascript_practice {
	@Test
	public void example() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
       WebDriver  driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
		 driver.get("https://opensource-demo.orangehrmlive.com");
		 //complete javascript - inspcet console in webpage
		 JavascriptExecutor je= (JavascriptExecutor)driver;
		 je.executeScript("document.getElementById('txtUsername').value='Admin'");
		 je.executeScript("document.getElementById('txtPassword').value='admin123'");
		// je.executeScript("")
		 // webdriver and javascript
		 WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		 je.executeScript("arguments[0].click()", loginbutton);
		 je.executeScript("document.getElementById('menu_admin_membership').click()");
		 WebElement membership =driver.findElement(By.id("btnAdd"));
		 je.executeScript("arguments[0].click()",membership);
		je.executeScript("document.getElementById('membership_name').value='sss'") ;
		 //WebElement add = driver.findElement(By.id("membership_name"));
		 //je.executeScript("arguments[0].setAttribute('value','aicte')",add);
	}
	

}

