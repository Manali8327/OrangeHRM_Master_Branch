package cucumber_tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Drop_down_without_select_tag;
import utility.Synchronization_Wait;
import utility.mouse_Operations_Key_Operation;
import utility.selenium_from_scratch;

public class Pim_creations {
	WebDriver driver;
	@Given("user is on login page")
	public void login_page() {
		driver = selenium_from_scratch.set_up_browser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@When("Verify that user can able to login with valid {string} and {string}")
	public void login_elements(String username,String password) {
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		   Username.sendKeys(username);
		   WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
	       Password.sendKeys(password);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("Verify the title of the page")
	public void title_verification() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@When("verify the list of menu and hover on it one by one")
	public void list_of_menu() throws InterruptedException {
		List<WebElement> list_menu = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
		Drop_down_without_select_tag.Without_select_tag_getAlloptions(list_menu);
		mouse_Operations_Key_Operation.moveTolistofelement(driver, list_menu);
	}
	
	@When ("Pim creation")
	public void pimcreation() {
		WebElement pim_button = driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]"));
		pim_button.click();
		WebElement addbutton  =  driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
		addbutton.click();
	}
	@And("Give fname lname and mname and id")
    public void pim_details() throws InterruptedException {
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstName']"));
	    fname.sendKeys("rahul");
	    WebElement lname = driver.findElement(By.xpath("//input[@name='lastName']"));
	    lname.sendKeys("Jishant");
	    WebElement mname = driver.findElement(By.xpath("//input[@name='middleName']"));
	    mname.sendKeys("ashitosh");
	    Thread.sleep(2000);
	    WebElement id = driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div/div/div[2]/input"));
	    Synchronization_Wait.Webdriver_wait(driver).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div/div/div[2]")));
	    id.clear();
	    id.sendKeys("0456");
	    WebElement save_button = driver.findElement(By.xpath("//button[@type='submit']"));
	    save_button.click();
	}
	
	@And("after click on save  button name of employee should be as per details filled")
	public void verify_name() throws InterruptedException {
		WebElement employe_name = driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-name']/h6"));
		String given_name = employe_name.getText();
		Thread.sleep(1000);
		System.out.println("The name of the employee is = "+given_name);
	}
}
