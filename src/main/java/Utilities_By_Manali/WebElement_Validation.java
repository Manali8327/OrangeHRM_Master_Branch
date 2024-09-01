package Utilities_By_Manali;

import org.openqa.selenium.WebElement;

public class WebElement_Validation {

	public static void validation(WebElement element) {
	
		
		System.out.println("************ WebElement Validation Starts ***********");
		
		if(element.isDisplayed()==true) {
		  System.out.println("The Element is Visible");
		}else {
			System.err.println("The element is not Visible ");
		}
		
		if(element.isEnabled()==true) {
			  System.out.println("The Element is Enabled");
			}else {
				System.err.println("The element is not Functional ");
			}
		
		if(element.isSelected()==true) {
			  System.out.println("The Element is Selected");
			}else {
				System.err.println("The element is not Selected ");
			}
		
		System.out.println("************ Validation successful **************");
	}
	
	
	
	
 }
