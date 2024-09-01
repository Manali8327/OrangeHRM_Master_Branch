package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class property_file {
	
	public static Properties get_data(String file_location) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(file_location);
			prop.load(fis);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return prop;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String path = scn.nextLine();
		property_file ref = new property_file();
		ref.get_data(path);

	}

}
