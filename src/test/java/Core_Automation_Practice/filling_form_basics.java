package Core_Automation_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.Drop_Down;
import utility.Synchronization_Wait;
import utility.Takes_screenshot;
import utility.WebElement_Validation;
import utility.mouse_Operations_Key_Operation;
import utility.selenium_from_scratch;

public class filling_form_basics {
  
	public static void main(String[] args) throws InterruptedException {
	
	   WebDriver driver = selenium_from_scratch.set_up_browser("chrome", "https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
	   driver.manage().window().maximize();
	   Synchronization_Wait.Webdriver_wait(driver).until(ExpectedConditions.titleContains("Complete Registration form"));
		
	    WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
	    WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
	    WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	    WebElement discription = driver.findElement(By.xpath("//textarea[@name='description']"));
		WebElement math_checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @name='maths']"));
		WebElement physics_checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @name='physics']"));
		WebElement radio_button_maths = driver.findElement(By.xpath("//input[@type='radio' and @value='maths']"));
		WebElement radio_button_physics = driver.findElement(By.xpath("//input[@type='radio' and @value='physics']"));
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
		List<WebElement> dropdownlist = driver.findElements(By.xpath("//select[@name='dropdown']/option"));
		WebElement uploadfile = driver.findElement(By.xpath("//input[@name='fileupload']"));
		WebElement submit_button = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement_Validation.webelement(fname);
		WebElement_Validation.webelement(lname);
		WebElement_Validation.webelement(pass);
		
		mouse_Operations_Key_Operation.sendkeys(fname, "vaman");
		mouse_Operations_Key_Operation.sendkeys(lname, "sumran");
		mouse_Operations_Key_Operation.sendkeys(pass, "adminn122");
		Synchronization_Wait.sleeptime(2000);
		mouse_Operations_Key_Operation.sendkeys(discription, "Quality Assurance Specialist responsibilities include developing quality standards, conducting tests and identifying issues in the production of our products or services. Ultimately, you will work with a team to ensure our final products meet our organization's standards across the board");
		Synchronization_Wait.sleeptime(2000);
		mouse_Operations_Key_Operation.click(math_checkbox);
		Synchronization_Wait.sleeptime(2000);
		mouse_Operations_Key_Operation.click(physics_checkbox);
		Synchronization_Wait.sleeptime(2000);
		mouse_Operations_Key_Operation.click(radio_button_maths);
		Synchronization_Wait.sleeptime(2000);
		mouse_Operations_Key_Operation.click(radio_button_physics);
		Synchronization_Wait.sleeptime(2000);
		mouse_Operations_Key_Operation.sendkeys(uploadfile, "C:\\Users\\GURU\\Downloads\\OrangeHRM.png");
		Synchronization_Wait.sleeptime(2000);
		dropdown.click();
		Drop_Down.getAllOptions(dropdown);
		Drop_Down.selectByVisibletext(dropdown, "Maths");
		Synchronization_Wait.sleeptime(2000);
		Drop_Down.selectByVisibletext(dropdown, "Physics");
		Synchronization_Wait.sleeptime(5000);
		Takes_screenshot.screenshot(driver, "./Screenshots/registration_sel.png");
		mouse_Operations_Key_Operation.click(submit_button);
		
   }
}
