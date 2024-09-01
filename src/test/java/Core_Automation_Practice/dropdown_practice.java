package Core_Automation_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Drop_down_without_select_tag;
import utility.selenium_from_scratch;

public class dropdown_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = selenium_from_scratch.set_up_browser("chrome", "https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		//Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//div[text()='Select Option']"));
		dropdown.click();
		List<WebElement>  list= driver.findElements(By.xpath("//div[contains(@id,'react-select') and @tabindex='-1']"));
		 Actions action  = new Actions(driver);
	/*	for(int i=0;i<list.size();i++) {
			String getoptions = list.get(i).getText();
			System.out.println("The text at position = "+"["+i+"]"+getoptions);
		}
	*/	
		 action.scrollByAmount(0, 300).build().perform();
		//System.out.println("The size  = "+list.size());
		Drop_down_without_select_tag.Without_select_tag_getAlloptions(list);
		
		
		
		
		

	}

}
