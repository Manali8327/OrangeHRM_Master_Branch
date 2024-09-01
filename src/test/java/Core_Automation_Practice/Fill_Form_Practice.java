package Core_Automation_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import utility.property_file;
import utility.selenium_from_scratch;

public class Fill_Form_Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = selenium_from_scratch.set_up_browser("chrome", "https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        String page_Titile = "DEMOQA";
		wait.until(ExpectedConditions.titleIs(page_Titile));
		Actions action = new Actions(driver);
		
		Wait fluent_wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(ScriptTimeoutException.class);
		
		
		
		
		WebElement first_Name = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement last_Name = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement email_d = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement mobile_Number = driver.findElement(By.xpath("//input[@id='userNumber']"));
		WebElement date_Of_Birth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		WebElement Subject = driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div[1]"));
		List<WebElement> list_of_checkbox = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div"));
		
		WebElement file_Upload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		WebElement select_state_dropdown = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']/div[text()='Select State']"));
		WebElement select_city_dropdown = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']/div[text()='Select City']"));
		WebElement submit_button = driver.findElement(By.xpath("//button[@id='submit']"));
		
		
		first_Name.sendKeys("Ajay");
		last_Name.sendKeys("Gaikwad");
		email_d.sendKeys("gaikwadajay547@gmail.com");
		Gender.click();
		mobile_Number.sendKeys("1234567890");
		//Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(date_Of_Birth));
		date_Of_Birth.click();
		System.out.println("**** To Select date fo Birth Need to select fields******* ");
		//date_Of_Birth.sendKeys("");
		//Thread.sleep(2000);
		//WebElement calender_to_be_shown = driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='react-datepicker__month-container']")));
		//action.scrollByAmount(0, 500);
		WebElement years = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select scn_years = new Select(years);
		scn_years.selectByValue("1997");
		
		WebElement Months = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select scn_months = new Select(Months);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@class='react-datepicker__month-select']")));
		scn_months.selectByVisibleText("December");
		WebElement Day = driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[4]/div[2]"));
		Day.click();
		action.scrollByAmount(0, 600).perform();
		//JavascriptExecutor jsc = (JavascriptExecutor)driver;
		//jsc.executeAsyncScript("window.scrollBy(0,400)");
		//Thread.sleep(3000);
		//fluent_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='subjectsContainer']/div/div[1]")));
		//action.moveToElement(Subject);
		//Subject.sendKeys("Automation");
		String states_names="";
		file_Upload.sendKeys("C:\\Users\\GURU\\Downloads\\lenze auomation.PNG");
		select_state_dropdown.click();
		List<WebElement> state_names  = driver.findElements(By.xpath("//div[@class=' css-11unzgr']/div"));
		for(int i=0;i<state_names.size();i++) {
			 states_names = state_names.get(i).getText();
			System.out.println(states_names);
		}
		state_names.get(3).click();
		
	//	WebElement Hobbies_single_element = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	//	fluent_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='hobbies-checkbox-1']")));
	//	Hobbies_single_element.click();
		List<WebElement> Hobbies_list = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/input[@type='checkbox']"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/input[@type='checkbox']")));
		for(int i=1;i<Hobbies_list.size();i++) {
		   Hobbies_list.get(i).click();
		      
		}
		
		
		
	
		
		
		
		
		
		
		
	}

}
