package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation_to {

	public static void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public static void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	public static void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public static void URL(WebDriver driver,String url) {
		driver.navigate().to(url);
	}
	
	
	public static void iFrame_weblement(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void iFrame_index(WebDriver driver,int i) {
		driver.switchTo().frame(i);
		
	}
	
	public static void switch_to_default_content(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
}
