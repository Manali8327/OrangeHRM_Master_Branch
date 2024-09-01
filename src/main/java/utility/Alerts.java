package utility;

import org.openqa.selenium.WebDriver;

public class Alerts {

	public static void accept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void dismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public static void get_text(WebDriver driver) {
		driver.switchTo().alert().getText();
	}
	
	
	public static void sendkeys(WebDriver driver,String message) {
		driver.switchTo().alert().sendKeys(message);
	}
	
	public static void defaultcontent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	
	
	
}
