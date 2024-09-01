package utility;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class selenium_from_scratch {
          
	
	public static WebDriver set_up_browser(String browser_name, String URl) {
		WebDriver driver = null;

		if (browser_name.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(URl);
		} else if (browser_name.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(URl);
		} else if (browser_name.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(URl);
		} else if (browser_name.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(URl);
		}
		return driver;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String browser_name = scn.nextLine();
		String URl = scn.nextLine();
		set_up_browser(browser_name, URl);
		

	}

}
