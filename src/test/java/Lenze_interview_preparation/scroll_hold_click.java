package Lenze_interview_preparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scroll_hold_click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=machinery+items&crid=2JNZAMW3PPYS7&sprefix=machinar%2Caps%2C188&ref=nb_sb_ss_pltr-sample-20_1_8");
        Actions actn = new Actions(driver);
       // WebElement element = driver.findElement(By.xpath("//span[@class='action-inner']"));
       // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='action-inner']")));
       Thread.sleep(2000);
        actn.scrollByAmount(0, 5000 ).perform();
        System.out.println("KKKKKKKKKKK");
	}

}
