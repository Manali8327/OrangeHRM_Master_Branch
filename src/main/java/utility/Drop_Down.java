package utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	
	public static void select_tag_validation(WebElement element) {
	//	WebElement dropdown_element = element;
		Select select_drop_down =  new Select(element);
	
	System.out.println("********** Drop Down Validation ********");
	
	boolean multiple_selected = select_drop_down.isMultiple();
	if(multiple_selected==true) {
		System.out.println("Drop Down is multiple selectable");
	}else {
		System.out.println("Drop Down is not multiple selectable");
	}
	System.out.println("************ Validation Succesfull *********");
	
	}
	
	public static void getAllOptions(WebElement element) throws InterruptedException {
		System.out.println("******List of All Options *******");
		Select select_drop_down =  new Select(element);
		List<WebElement> list = select_drop_down.getOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println("The Text At position " +"["+i+"]"+ list.get(i).getText());
			//Thread.sleep(500);
		}
		System.out.println("******List of All Options Done *******");
	}
	
	public static void getAllSelectedOptions(WebElement element) {
		Select select_drop_down =  new Select(element);
		List<WebElement> list = select_drop_down.getAllSelectedOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println("The Text At position " +"["+i+"]"+ list.get(i).getText());	
		}
		
	}
	
	public static void getFirstselectedOption(WebElement element) {
		Select select_drop_down =  new Select(element);
		 WebElement default_option = select_drop_down.getFirstSelectedOption();
		 System.out.println("The default selected option is = "+default_option.getText());
	}
	
	public static void selectByIndex(WebElement element,int index_number) {
		Select select_drop_down =  new Select(element);
	    select_drop_down.selectByIndex(index_number);
	}
	
	
	public static void selectByVisibletext(WebElement element, String text) {
		Select select_drop_down =  new Select(element);
		select_drop_down.selectByVisibleText(text);
	}
	
	public static void selectByVisibleValue(WebElement element,String text) {
		Select select_drop_down =  new Select(element);
		select_drop_down.deselectByValue(text);
	}
	
	public static void selectmultipleelement(WebElement element) throws InterruptedException {
		Select select_drop_down =  new Select(element);
		List<WebElement> list = select_drop_down.getOptions();
		for(int i=0;i<list.size();i++) {
			list.get(i).click();
			Thread.sleep(500);
		}
	}
	
	
	
	
	

}