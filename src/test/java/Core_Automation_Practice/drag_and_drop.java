package Core_Automation_Practice;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.selenium_from_scratch;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = selenium_from_scratch.set_up_browser("chrome", "https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Actions action = new Actions(driver);
        Wait fluentwait = new FluentWait(driver)
        		.withTimeout(Duration.ofSeconds(20))
        		.pollingEvery(Duration.ofSeconds(5))
        		.ignoring(NoSuchElementException.class);
      //  Thread.sleep(2000);
        wait.until(ExpectedConditions.titleIs("Drag And Drop - GlobalSQA"));
       WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
       driver.switchTo().frame(frame);
       
       
		List<WebElement> dragable = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
	   // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[@class='ui-widget-header']")));
	   fluentwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']")));
	   WebElement dropable = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
	   
	   
		//WebElement dropable = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
	    for(int i= 0;i<dragable.size();i++) {
	    	action.dragAndDrop(dragable.get(i), dropable).build().perform();
	    	Thread.sleep(2000);
	    }
	    
	    List<WebElement> restore_img = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']/a[2]"));
	    for(int i =0;i<restore_img.size();i++) {
	    	restore_img.get(i).click();
	    	Thread.sleep(2000);
	    }
	
	}

}
