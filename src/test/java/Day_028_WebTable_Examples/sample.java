package Day_028_WebTable_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtil.TestBrowser;

public class sample {
	WebDriver driver;
	
		
		//=============================================
		//@Test
		public void sample() throws Exception
		{
			
			
			 driver=TestBrowser.OpenChromeBrowser();
			Login l1=new Login();
			l1.Login(driver);
			l1.openOrangeHRM();
			l1.OrangeHRMlogin("Admin","admin123");
			l1.OrangeHRMSigninClick();
			 findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
			 findElement(By.xpath("//*[@id=\'menu_admin_Job\']")).click();
			 
			 findElement(By.xpath("//*[@id=\'menu_admin_viewJobTitleList\']")).click();
		String rowsbefore="//*[@id='resultTable']/tbody/tr[";
		String afterrows="]/td[2]";
			 List <WebElement> table= driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		int rows=table.size();
		System.out.println(rows);
			 for(int i=1;i<=rows;i++)
			 {
				// String path=rowsbefore+"i"+afterrows;
				String data= driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(data); 
			 }
			 
			 
		}


		private WebElement findElement(By xpath) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}
