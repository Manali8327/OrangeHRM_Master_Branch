package utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_Wait {
    
	public static WebDriverWait Webdriver_wait(WebDriver driver) {
	WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(5));
	return wait;
	}
	
	public static Wait Fluent_wait(WebDriver driver) {
		Wait fluent_wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		return fluent_wait;
	}
	
	
	public static void sleeptime(int i) throws InterruptedException {
		Thread.sleep(i);
	}
	
}
