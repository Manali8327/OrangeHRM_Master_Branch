package cucumber_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.selenium_from_scratch;

public class orange_hrm_login_page {
	WebDriver driver;
   @Given("User is on login page")
   public void urlenters() {
	   driver = selenium_from_scratch.set_up_browser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }
	
   @When("User enters {string} and {string}")
	public void login_crendetials(String username, String password) {
	   WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
	   Username.sendKeys(username);
	   WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
       Password.sendKeys(password);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
   }
	
	@Then("Verify the title of page")
	public void title_of_current_page() {
		String title = driver.getTitle();
		System.out.println("The title is  = "+title);
	}
	
		
	
	
}
