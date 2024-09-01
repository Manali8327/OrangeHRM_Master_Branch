package Utilities_By_Manali;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import groovy.ui.view.MacOSXDefaults;

public class Launch_Browser {
	
	public static WebDriver browser_launch(String browser_name, String URl) {
		WebDriver driver = null;
		
		if(browser_name.equalsIgnoreCase("Chrome")) {
			driver =  new ChromeDriver();
			driver.get(URl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else if(browser_name.equalsIgnoreCase("InternetExplorer")) {
			driver =  new InternetExplorerDriver();
			driver.get(URl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else if(browser_name.equalsIgnoreCase("FireFox")) {
			driver =  new FirefoxDriver();
			driver.get(URl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else {
			System.err.println("********* Invalid Browser Name *********");
		}
		
		return driver;
		
	}

}
