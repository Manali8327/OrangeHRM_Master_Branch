package POM_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class searched_page extends SeleniumUtility{
   
	public searched_page(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	public String getcurrent_pagetitle() {
		return driver.getTitle();
	}
}
