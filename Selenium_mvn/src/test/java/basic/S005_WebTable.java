package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;

import util.Driverconnection;

public class S005_WebTable {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/webtables");
		String myName = "Cierra";
		WebElement name = driver.findElement(By.xpath("//*[text()='"+myName+"']"));
		
		if(name.isDisplayed())
		{
			driver.findElement(By.xpath("//*[text()='"+myName+"']/following-sibling::div[6]/div/span[1]")).click();
		}
		else
		{
			System.out.println("Not found");
		}
		
	}
}
