package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("makeFlex")).click();
		driver.findElement(By.id("username")).sendKeys("nivedita199723@gmail.com");
		driver.findElement(By.cssSelector(".modalLogin")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.findElement(By.id("password")).sendKeys("fdfh");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("button")).click();
	}

}
