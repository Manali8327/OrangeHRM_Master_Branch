package utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takes_screenshot {

	public static void screenshot(WebDriver driver,String location_with_name_and_extension) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourse = ts.getScreenshotAs(OutputType.FILE);
		File destination =  new File(location_with_name_and_extension);
		try{
			FileUtils.copyFile(sourse, destination);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
