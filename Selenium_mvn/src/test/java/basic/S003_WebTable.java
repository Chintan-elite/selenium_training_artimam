package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S003_WebTable {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		WebElement value =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
		String data = value.getText();
		System.out.println(data);
		
		driver.quit();
		
	}
}
