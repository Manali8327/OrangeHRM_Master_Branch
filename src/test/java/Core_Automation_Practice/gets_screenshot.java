package Core_Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.Synchronization_Wait;
import utility.Takes_screenshot;
import utility.WebElement_Validation;
import utility.mouse_Operations_Key_Operation;
import utility.selenium_from_scratch;

public class gets_screenshot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = selenium_from_scratch.set_up_browser("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
		Synchronization_Wait.Webdriver_wait(driver).until(ExpectedConditions.titleIs("OrangeHRM"));
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password =  driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement login_button  = driver.findElement(By.xpath("//button[@type='submit']"));
		
		WebElement_Validation.webelement(username);
		WebElement_Validation.webelement(password);
		WebElement_Validation.webelement(login_button);
		mouse_Operations_Key_Operation.sendkeys(username, "Admin");
		mouse_Operations_Key_Operation.sendkeys(password, "admin123");
		mouse_Operations_Key_Operation.click(login_button);
		Thread.sleep(9000);
		Takes_screenshot.screenshot(driver, "./Screenshots/OrangeHRM.png");
		System.out.println("Takes ss");
		
		
	}

}
