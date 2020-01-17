package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Linkedin.com");
		driver.manage().window().maximize();
		//driver.findElement(By.name("session_key")).sendKeys("nivedita199723@gmail.com");
		//driver.findElement(By.name("session_password")).sendKeys("applesbaby2/");
		driver.findElement(By.cssSelector("body > nav > a.nav__button-secondary")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("nivedita199723@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("applesbaby2/");
		driver.findElement(By.cssSelector("#app__container > main > div > form > div.login__form_action_container > button")).click();
	}

}
