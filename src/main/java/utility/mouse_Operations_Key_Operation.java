package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouse_Operations_Key_Operation {
    
	public static void click(WebElement element) {
			element.click();
	}
	
	
	public static void scrollByValue(WebDriver driver,int i,int j) {
		Actions action = new Actions(driver);
		action.scrollByAmount(i, j).build().perform();;
		
	}
	
	public static void scrollByElement(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.scrollToElement(element).build().perform();
		
	}
	
	
	public static void moveToelement(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public static void moveTolistofelement(WebDriver driver,List<WebElement> element) throws InterruptedException {
		Actions action = new Actions(driver);
		for(WebElement ele:element) {
			action.moveToElement(ele).perform();;
			String text = ele.getText();
			Thread.sleep(2000);
		}
		
	}
	
	public static void sendkeys( WebElement element,String keys) {
		element.sendKeys(keys);
	}
	
	public void performDragAndDrop(WebDriver driver,WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}
	
}
