package Lenze_interview_preparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class trigger_suite {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	@Test
	public void every_test() {
		System.out.println("Before Test executed");
	}
	
	@AfterTest
	@Test
	public void after_test() {
		System.out.println("Before Test executed");
	}
  @BeforeMethod
  @Test
  public void Test_1() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username = driver.findElement(By.xpath("//div//input[@name='username']"));
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  
	  username.sendKeys("Admin");
	  password.sendKeys("admin123",Keys.ENTER);
  }
  
  @AfterMethod
  @Test
  public void Test_2() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username = driver.findElement(By.xpath("//div//input[@name='username']"));
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  
	  username.sendKeys("Admin");
	  password.sendKeys("admin123",Keys.ENTER);
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  
  }
  
  @Test
  public void pim() {
	  driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]")).click();
	  
  }
  
  
  
  
  
  
  
  
}
