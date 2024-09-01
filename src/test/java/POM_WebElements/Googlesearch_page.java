package POM_WebElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.Drop_down_without_select_tag;
import utility.SeleniumUtility;
import utility.Synchronization_Wait;
import utility.mouse_Operations_Key_Operation;

public class Googlesearch_page extends SeleniumUtility {

	public Googlesearch_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Google']")
	private WebElement google_Logo;
	
	
	@FindBy(xpath="//textarea[@id='APjFqb']")
	private WebElement search_Inputfield;
	
	@FindBy(xpath = "//div[@id='Alh6id' and @role='presentation']/div/div/ul/li/div/div[2]")
	private List<WebElement> searched_Suggestions;
    //Google Logo get Method
	public WebElement getgoogle_Logo() {
		return google_Logo;
	} 
	//searchfield get Method
	public WebElement getSearch_Inputfield() {
		return search_Inputfield;
	}
	//List of the element get Method
	public List<WebElement> getSearched_Suggestions() {
		return searched_Suggestions;
	}
    
	//Google logo
	public boolean goole_logo_Displayed() {
		return google_Logo.isDisplayed();
	}
	
	
	//type method
	public void type_Text(String text) throws InterruptedException {
		Thread.sleep(5000);
		//Synchronization_Wait.Webdriver_wait(driver).until(ExpectedConditions.elementToBeClickable(search_Inputfield));
		mouse_Operations_Key_Operation.sendkeys(search_Inputfield, text);
		
	}
	 
	//List get all suggested list options
	public void list_of_Elements() {
		Drop_down_without_select_tag.Without_select_tag_getAlloptions(searched_Suggestions);
	}
	
	
	
	
}
