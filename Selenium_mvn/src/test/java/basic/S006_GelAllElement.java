package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class S006_GelAllElement {
	public static void main(String[] args) {
		WebDriver driver = Driverconnection.connect("https://www.facebook.com/");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		
		driver.quit();
	}
}
