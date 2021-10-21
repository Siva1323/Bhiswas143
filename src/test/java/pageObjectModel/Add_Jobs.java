package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Add_Jobs {
	WebDriver driver;
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
  @Test
  public void AddJobs_Login() throws Exception {
	  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	  
	  POM_Login P1= new POM_Login(driver);
	  P1.Login();
	  
	  POM_Addjobs A1 = new POM_Addjobs(driver);
	  A1.AddJobs();
	 
	  
	  POM_Homepage H1 = new POM_Homepage(driver);
	  H1.Logout();
  }
	  @AfterTest 
		public void  TestCloser()throws Exception {
			
			driver.quit();
  }
}
