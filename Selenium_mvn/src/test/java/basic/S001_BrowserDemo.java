package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S001_BrowserDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://topsint.com/topserp/index.php");
		driver.manage().window().maximize();
		
		String expectedTitle = "Welcome to TOPS Management System";
		String actultitle = driver.getTitle();
		System.out.println(actultitle);
		if(expectedTitle.equals(actultitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();
	}
}
