package Lenze_interview_preparation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drag_drop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Actions act  = new Actions(driver);
		
		List<WebElement> drag_element =  driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		//WebElement drop = driver.findElement(By.id("trash"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trash")));
		WebElement drop = driver.findElement(By.id("trash"));
		for(int i = 0;i<drag_element.size();i++) {
			act.dragAndDrop(drag_element.get(i), drop).build().perform();
		}
		
		
		
		
		
		
	}

}
