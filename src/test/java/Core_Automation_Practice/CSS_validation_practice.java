package Core_Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Css_validation;
import utility.WebElement_Validation;
import utility.selenium_from_scratch;

public class CSS_validation_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = selenium_from_scratch.set_up_browser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(1000, 1000));
		WebElement username_Hrm = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password_Hrm = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		System.out.println("************ Username Validation **********");
		WebElement_Validation.webelement(username_Hrm);
		System.out.println("************ Password validation Validation **********");
		WebElement_Validation.webelement(password_Hrm);
		WebElement Login_button = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("************ Login button Validation **********");
	    WebElement_Validation.webelement(Login_button);
	    
	   System.out.println("***** The Login Process Starts *****");
	   username_Hrm.sendKeys("Admin");
	   password_Hrm.sendKeys("admin124");
	   Login_button.click();
	   System.out.println("***** The Login Process succesfull  *****");
	   Thread.sleep(2000);
	   WebElement error_msg_for_invalid_cred = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
	   System.out.println("The text occure in msg:-"+error_msg_for_invalid_cred.getText());
	   System.out.println("The color:-"+error_msg_for_invalid_cred.getCssValue("color"));
	   System.out.println("The Font family :-"+error_msg_for_invalid_cred.getCssValue("font-family"));
	   System.out.println("The Font size :-"+error_msg_for_invalid_cred.getCssValue("font-size"));
	   
	   Css_validation.webelement_to_be_search(error_msg_for_invalid_cred);
	   
	   
	 //  driver.close();
	   
		
		
		
		
		
		
		
		
	}

}
