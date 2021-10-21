package Bhiswas11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class gmaiKatalon {
	WebDriver driver;

	 @Test
	  public void testUntitledTestCase() throws Exception {
	    driver=TestBrowser.OpenChromeBrowser();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId")).sendKeys("siva1323");	
	    driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Bhiswas@1");
	    driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	  }
	 

}