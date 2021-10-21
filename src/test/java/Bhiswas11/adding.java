package Bhiswas11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class adding {
	WebDriver driver;
	
	int a,b,c;
  @Test
  public void addition() {
	  
	  a=10;
	  b=30;
	  c=a+b;
	  System.out.println("the c value is:"+c);
  }
}
