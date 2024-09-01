package cucumber_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.gson.annotations.Until;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Synchronization_Wait;
import utility.selenium_from_scratch;

public class google_Text_to_search {
	WebDriver driver;
	@Given("user is already on google home page")
	public void user_is_already_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	     driver = selenium_from_scratch.set_up_browser("chrome", "https://www.google.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user enters {string} in search field")
	public void user_enters_text_to_besearch_in_search_field(String text_to_besearch) {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.cssSelector("#APjFqb")).sendKeys(text_to_besearch);
	
	}

	@And("user click on search button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element =  driver.findElement(By.xpath("/div[@class='lJ9FBc']/center/input[1]"));
		Synchronization_Wait.Webdriver_wait(driver).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/div[@class='lJ9FBc']/center/input[1]")));
		
	    
	}

	@Then("Verify the title of the page With {string}")
	public void verify_the_title_of_the_page_with_text_to_be_search(String text_to_besearch) {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getCurrentUrl();
		if(title.contentEquals(text_to_besearch)) {
			System.out.println("The URl is correct");
		}else {
			System.out.println("Wrong text to be search");
		}
		
		
	   
	}
}
