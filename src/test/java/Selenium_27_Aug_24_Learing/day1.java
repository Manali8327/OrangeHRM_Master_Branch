package Selenium_27_Aug_24_Learing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities_By_Manali.WebElement_Validation;

public class day1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  =  new ChromeDriver();
		System.out.println("Complete");
	//	WebDriver drivers = new InternetExplorerDriver();
		//System.out.println("Complete");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	/*	driver.manage().window().maximize();
		Thread.sleep(5000);
		Dimension  dim =  new Dimension(800, 700);
		driver.manage().window().setSize(dim);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("successfull");
	*/	driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		System.out.println("is that visible = "+username.isDisplayed());
		System.out.println("is that Enabled = "+username.isEnabled());
		System.out.println("is that selected = "+username.isSelected());
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		//String result = WebElement_Validation.validation(password);
	
		
	}

}
