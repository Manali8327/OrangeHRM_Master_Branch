package POM_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Synchronization_Wait;
import utility.selenium_from_scratch;
import POM_WebElements.Googlesearch_page;
import POM_WebElements.searched_page;

public class Google_search_Validations {
	Googlesearch_page googlesearch_Page;
	searched_page     searchedPage;
	
	WebDriver driver;
	@BeforeTest
	public void goolepage() {
		driver=selenium_from_scratch.set_up_browser("chrome", "https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj9oJiu-paHAxVlzTgGHeliB3UQPAgI");
		googlesearch_Page =  new Googlesearch_page(driver);
		searchedPage = new searched_page(driver);
		
	}
	
  @Test(priority = 1)
  public void logo_validation() {
	  Assert.assertTrue(googlesearch_Page.goole_logo_Displayed());
	  System.out.println("Logo displayed");
	 
  }
  
  @Test(priority = 2)
  public void type_inputfield() throws InterruptedException {
	  
	  googlesearch_Page.type_Text("Selenium");
  }
  
  @Test(priority = 3)
  public void list_ofthe_element() throws InterruptedException {
	  googlesearch_Page.list_of_Elements();
	  Thread.sleep(2000);
  }
  @Test(priority = 4)
  public void moveto_activeelement() {
	  googlesearch_Page.getActitveElement().sendKeys(Keys.ENTER);
  }
  
  @Test(priority = 5)
  public void dashboard() {
	  searchedPage.getcurrent_pagetitle();
  }
  
  
  
}
