package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S002_fbSignUp {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement signup =  driver.findElement(By.linkText("Create new account"));
		signup.click();
	
		
		
		driver.findElement(By.name("firstname")).sendKeys("tops");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("455525555");
		driver.findElement(By.id("password_step_input")).sendKeys("tops@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByIndex(4);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByValue("2019");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		driver.findElement(By.name("websubmit")).click();
	}
}
