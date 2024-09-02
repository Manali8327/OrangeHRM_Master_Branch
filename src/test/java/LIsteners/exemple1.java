package LIsteners;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class exemple1 extends SeleniumUtility{
	WebDriver driver = new ChromeDriver();
  @Test
  public void Tests1() {
	  driver.get("https://www.saucedemo.com/v1/");
	  String Excpected_title = "SwagLabs";
	  Assert.assertEquals(driver.getTitle(), Excpected_title,"Test is Failure");
  }
  
  @Test
  public void Tests2() {
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
 
  }
  
  @Test
  public void Tests3() {
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
     List<WebElement> elementlist =  driver.findElements(By.xpath("//div[@class='inventory_item_label']/a"));
     for(int i = 0;i<elementlist.size();i++) {
    
    	 System.out.println("The name product is : "+elementlist.get(i).getText());
     }
  
  
  
  
  }
  
  
  
  
  
}
