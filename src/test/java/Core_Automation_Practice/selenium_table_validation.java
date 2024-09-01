package Core_Automation_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.Synchronization_Wait;
import utility.Table_Validation;
import utility.selenium_from_scratch;

public class selenium_table_validation {

	public static void main(String[] args) {
		
		WebDriver driver = selenium_from_scratch.set_up_browser("chrome", "https://seleniumpractise.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Synchronization_Wait.Fluent_wait(driver).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='customers']")));
		List<WebElement> row_count = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")); 
		System.out.println("The size of the rows = "+row_count.size());
		
		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	    List<WebElement> column_data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		List<WebElement> row_data  = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]"));
	    
	    
		Table_Validation.element_validation(tabledata, "elenium");
		Table_Validation.header_counts_andValues(headers);
		Table_Validation.colunm_vice_data(column_data);
	    Table_Validation.row_vice_data(row_data);
	    
        
		
		
		
		
		
		
		
		
		
		
	}

}
