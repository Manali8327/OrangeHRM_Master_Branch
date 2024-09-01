package Core_Automation_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.selenium_from_scratch;

public class Upload_file_on_WebPage {

	public static void main(String[] args) {
		WebDriver driver = selenium_from_scratch.set_up_browser("chrome", "http://demo.guru99.com/test/upload/");
        WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        
		String path = "C:\\Users\\GURU\\Downloads\\lenze auomation.PNG";
		WebElement file_upload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Wait.until(ExpectedConditions.elementToBeClickable(file_upload));
		file_upload.sendKeys(path);
	
		
	}

}
