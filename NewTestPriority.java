package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestPriority {

  WebDriver driver;			


  // Method 2: Launch Google.com			
  @Test (priority=1)		
  public void launchGoogle() {			
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get("http://www.google.co.in");						
  }		
  
  
  // Method 3: Perform a search using "Facebook"			
  @Test (priority=2)	
  public void peformSeachAndClick1stLink() {	
	 
	 driver.findElement(By.name("q")).sendKeys("LinkedIn");								
  }		

  // Method 4: Verify Google search page title.			
  @Test (priority=3)	
  public void FaceBookPageTitleVerification() throws Exception {	
	
      driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();						
      Thread.sleep(3000);		
      Assert.assertEquals(driver.getTitle().contains("LinkedIn - Google Search"), true);		
}
}