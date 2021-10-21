package Bhiswas11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Katalon {
 WebDriver driver;
 
	  
	  
	  @Test
	  public void Practice() throws Exception {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		    driver.get("https://www.amazon.in/");
		    driver.findElement(By.linkText("Mobiles")).click();
		    driver.findElement(By.xpath("//div[@id='sobe_d_b_6-carousel-viewport-container']/div/button[2]")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='sobe_d_b_6-carousel-viewport-container']/div/button[2] | ]]
		    driver.findElement(By.xpath("//div[@id='sobe_d_b_6-carousel-viewport-container']/div/button[2]")).click();
		    driver.findElement(By.xpath("//div[@id='sobe_d_b_6-carousel-viewport-container']/div/button[2]")).click();
		    driver.findElement(By.xpath("//li[@id='sobe_d_b_6_9']/a/img")).click();
		    driver.findElement(By.xpath("//img[@alt='realme C11 (2021) (Cool Grey, 4GB RAM+64GB Storage) with No Cost EMI/Additional Exchange Offers']")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
		    driver.close();
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
		    driver.close();
		  }
}
