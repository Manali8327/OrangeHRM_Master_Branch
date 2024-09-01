package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Drop_down_without_select_tag {

	public static void Without_select_tag_getAlloptions(List<WebElement> element) {
		
			//newsinglelement.click();
		    List<WebElement> newelement = element;
		    System.out.println("The element size is  = "+newelement.size());
		for(int i=0;i<newelement.size();i++) {
				String text = newelement.get(i).getText();
				System.out.println("The text at position"+"["+i+"]"+text);
			}
		System.out.println("***** print list element succesfull ******");
		
		}
	
	public static void Without_select_tag_selectvisibleBytext(WebElement singleelement,List<WebElement> element,String text) {
		singleelement.click();
		for(int i=0;i<element.size();i++) {
			String text1 = element.get(i).getText();
			if(text.equalsIgnoreCase(text1)) {
				WebElement newelement = element.get(i);
				newelement.click();
			}else {
				System.out.println("Please enter correct value");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
