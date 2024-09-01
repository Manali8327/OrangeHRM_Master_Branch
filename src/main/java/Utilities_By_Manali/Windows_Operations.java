package Utilities_By_Manali;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class Windows_Operations {

	public static void maximize(WebDriver driver ) {
		driver.manage().window().maximize();
	}
	
	public static void minimize_withDimension(WebDriver driver ) {
		Dimension  dim = new Dimension(800,900);
		driver.manage().window().setSize(dim);
	}
	
	public static  void close(WebDriver driver) {
		driver.close();
	}
	
	public static  void quit(WebDriver driver) {
		driver.quit();
	}
	
}
