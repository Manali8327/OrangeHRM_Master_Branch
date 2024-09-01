package utility;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElement_Validation {

	public static void webelement(WebElement element) {
		System.out.println("********* The validation starts *********");
		boolean element_isdiplayed = element.isDisplayed();
		boolean element_isenabled = element.isEnabled();
		boolean element_isselectable = element.isSelected();
		if(element_isdiplayed==true) {
			System.out.println("The Element  is displayed");
		}else{
			System.out.println("The Element is not diplayed");
		}if(element_isenabled==true) {
			System.out.println("The Element is Enabled");
		}else {
			System.out.println("The Element is not Enabled");
		}if(element_isselectable==true) {
			System.out.println("The element is selectable");
		}else {
			System.out.println("The Element is not selectable");
		}
		System.out.println(">>>>>>>>>>>>> WebElement Validation Successfull <<<<<<<<<");
	}
	
	/* int number=20;  
	    //Switch expression  
	    switch(number){  
	    //Case statements  
	    case 10: System.out.println("10");  
	    break;  
	    case 20: System.out.println("20");  
	    break;  
	    case 30: System.out.println("30");  
	    break;  
	    //Default case statement  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
	*/
	
	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
	//	String URl = scn.nextLine();
	//	String browser = scn.nextLine();
	//	WebDriver driver = selenium_from_scratch.set_up_browser(browser, URl);
		WebElement_Validation ref_valid = new WebElement_Validation();
		ref_valid.webelement(null);

	}

}
