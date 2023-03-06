package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
		
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "D:\\BrowserDriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://topsint.com/topserp/index.php");
		driver.manage().window().maximize();
		
		
		
		
		
		
	}
}
