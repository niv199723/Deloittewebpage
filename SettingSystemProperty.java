package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingSystemProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//maximize window
		driver.manage().window().maximize();
		
		//finding the element using the locater
		
		driver.findElement(By.name("q")).sendKeys("Nivedita Deloitte Bangalore");

	}

}
