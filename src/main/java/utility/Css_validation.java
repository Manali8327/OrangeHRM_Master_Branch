package utility;

import org.openqa.selenium.WebElement;

public class Css_validation {
	
	public static void webelement_to_be_search(WebElement element) {
		System.err.println("\\\\\\\\\\ The Css Validations ////////");
		System.out.println("The Font color is >>>>> "+element.getCssValue("color"));
	    System.out.println("THe Font Size is >>>>>>"+element.getCssValue("font-size"));
	    System.out.println("The Font Family is >>>>>"+element.getCssValue("font-family"));
	    System.out.println("The Font background color is >>>>"+element.getCssValue("background"));
	    System.out.println("The Font Weight is >>>>"+element.getCssValue("font-weight"));
	    System.out.println("The text is >>>>>"+element.getText());
	    System.err.println("\\\\\\\\\\ The Css Validations succesfull ////////");
	
	
	
	}
	
	public static void main(String[] args) {
		Css_validation ref =  new Css_validation();
		ref.webelement_to_be_search(null);

	}

}
