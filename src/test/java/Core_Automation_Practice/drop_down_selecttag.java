package Core_Automation_Practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.hwpf.model.types.FibRgLw95AbstractType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import utility.Drop_Down;
import utility.selenium_from_scratch;

public class drop_down_selecttag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = selenium_from_scratch.set_up_browser("chrome", "https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		Thread.sleep(2000);
		
		String Expected_title  = "DropDown Menu - GlobalSQA";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Fluent Wait 	
		Wait fluent_wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		fluent_wait.until(ExpectedConditions.titleContains("GlobalSQA"));
	// Fluent Wait Ends
	
		//Title Verification
		String actual_title = driver.getTitle();
		System.out.println("The expected and actual is  = "+Expected_title.equals(actual_title));
		if(Expected_title.equals(actual_title)) {
			System.out.println("The title is match");
		}else {
			System.out.println("The title is not macth");
		}

		System.out.println("The actual title is  = "+actual_title);
		//Title Verification Ends
		
		WebElement drop_down =  driver.findElement(By.xpath("//p//select"));
		Select sclt =  new Select(drop_down);
		WebElement firstoprtion = sclt.getFirstSelectedOption();
		System.out.println("The text is  = "+firstoprtion.getText());
		Drop_Down.select_tag_validation(drop_down);
		Drop_Down.getAllOptions(drop_down);
		Drop_Down.getFirstselectedOption(drop_down);
		Drop_Down.selectByIndex(drop_down, 13);
		Drop_Down.selectByVisibletext(drop_down, "Argentina");
		
		
		
		
		
		
	}

}
