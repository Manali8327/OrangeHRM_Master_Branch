package Core_Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebElement_Validation;
import utility.selenium_from_scratch;

public class core1st_browser_launch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = selenium_from_scratch.set_up_browser("chrome","https://www.saucedemo.com/v1/" );
		//driver.close();
		//WebDriver drivers = selenium_from_scratch.set_up_browser("edge","https://developer.mozilla.org/en-US/docs/Learn/JavaScript/First_steps/What_is_JavaScript" );
	    //We can't open two browser simultaneously
	    driver.manage().window().maximize();
	    Dimension d = new Dimension(1000, 1000);
	    Thread.sleep(2000);
	    driver.manage().window().setSize(d);
	    
	    driver.manage().deleteAllCookies();
	    System.out.println("succesfully Deleted all coockies ");
	    WebElement username = driver.findElement(By.id("user-name"));
	   // username.sendKeys("standard_user");
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	   System.out.println("******* Validation For username *********");
        WebElement_Validation.webelement(username);
        System.out.println("******* Validation For Password *********");
        WebElement_Validation.webelement(password); 
        System.out.println("************ Navigation ************");
         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(2000);
         driver.navigate().back();
         Thread.sleep(2000);
         driver.navigate().forward();
         Thread.sleep(2000);
         driver.navigate().refresh();
         System.out.println("******* All Navigation Operations Succesfully Done *******");
         driver.quit();
	}

}
