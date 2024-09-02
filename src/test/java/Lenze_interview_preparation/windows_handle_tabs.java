package Lenze_interview_preparation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class windows_handle_tabs {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/televisions/pr?sid=ckf%2Cczl&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&otracker=categorytree&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&p%5B%5D=facets.brand%255B%255D%3DThomson&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Thomson");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File flocation = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(flocation, new File("C:\\Users\\GURU\\Downloads.jpg"));
		WebElement element = driver.findElement(By.xpath("//div[@class='DOjaWF gdgoEp']/div[2]/div/div/div/a/div[@class='Otbq5D']"));
        element.click();
       
       String current_window = driver.getWindowHandle();
       System.out.println(current_window);
       Set<String> list_windows_id = driver.getWindowHandles();
       list_windows_id.remove(list_windows_id);
       Iterator<String> itr = list_windows_id.iterator();
       String child_window = itr.next();
       driver.switchTo().window(child_window);
       
       WebElement Tv_webelement = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[1]/div/div/img"));
        Tv_webelement.click(); 
        
	}

}
