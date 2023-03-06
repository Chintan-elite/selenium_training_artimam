package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class S008_MouseEvent {
	
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		
		
		Actions builder = new Actions(driver);
		
		//builder.dragAndDrop(from, to).build().perform();
		builder.clickAndHold(from)
				.moveToElement(to)
				.release()
				.build()
				.perform();
	}
}
