package Utilities_By_Manali;

import org.openqa.selenium.WebDriver;

public class Windows_Navigation {

	
	public static void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	public static void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public static void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
}
