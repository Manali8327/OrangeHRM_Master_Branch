package utility;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Table_Validation {

	public static void row_Count(List<WebElement> rowcount) {
		System.out.println("The Rows Count is -> " + rowcount);
	}

	public static void column_Count(List<WebElement> colcount) {
		System.out.println("THe Columns count -> " + colcount.size());
	}

	public static void element_validation(List<WebElement> element, String elementname) {
		System.out.println("********** element validation ********");
		boolean ch=false;
		for (WebElement ele : element) {
			String  elementstore=ele.getText();
			if (ele.getText().equalsIgnoreCase(elementname)) {
				System.out.println("The element is found that is  = " +elementstore);
				ch = true; 
				break;
			} 
		}
		if (ch == false) {
			System.out.println("The element is not found ");
		}
	
		
		System.out.println("********* succesfull *********");

	}

	public static void header_counts_andValues(List<WebElement> element) {
		System.out.println("************** Headears ****************");
		System.out.println("The Count of the headear = " + element.size());
		for (WebElement headers : element) {
			System.out.println(headers.getText());
		}
		System.out.println("********* succesfull *********");
	}

	public static void colunm_vice_data(List<WebElement> column_data) {
		System.out.println("********* Column Vice Data *********");
		for (WebElement element : column_data) {
			System.out.println(element.getText());
		}
		System.out.println("******* succesfull *******");
	}
	
	public static void row_vice_data(List<WebElement> row_data) {
		System.out.println("********* Row Vice Data *********");
		for (WebElement element : row_data) {
			System.out.println(element.getText());
		}
		System.out.println("******* succesfull *******");

	}
	
	
	

}
