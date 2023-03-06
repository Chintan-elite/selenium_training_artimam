package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		 WebElement email = driver.findElement(By.id("email"));
		 WebElement pass = driver.findElement(By.name("pass"));
		 WebElement login = driver.findElement(By.name("login"));
		 
		 
		 email.sendKeys("tops@gmail.com");
		 pass.sendKeys("tech123");
		 login.click();
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 driver.close();
		// driver.quit();
		
	}
}
