package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Driverconnection;

public class S010_multiplewindows {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demo.guru99.com/popup.php");
		
		String mainTab = driver.getWindowHandle();
		System.out.println("main : "+mainTab);
		driver.findElement(By.linkText("Click Here")).click();
		
		
		 Set<String> allwins =  driver.getWindowHandles();
		 for(String s : allwins)
		 {
			if(!s.equals(mainTab))
			{
				driver.switchTo().window(s);
			}
		 }
		
		driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
//		driver.close();
//		driver.switchTo().window(mainTab);
//		driver.close();
		
		
		driver.quit();
		
	}
}
