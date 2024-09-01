package Selenium_27_Aug_24_Learing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities_By_Manali.Launch_Browser;
import Utilities_By_Manali.WebElement_Validation;
import Utilities_By_Manali.Windows_Operations;

public class day1_by_utility {

	public static void main(String[] args) {
		 WebDriver driver  = Launch_Browser.browser_launch("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Windows_Operations.maximize(driver); 
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		 WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
	     WebElement_Validation.validation(username);
	     WebElement_Validation.validation(password);
	    // Windows_Operations.close(driver);
	     
	
	
	
	
	}

}
