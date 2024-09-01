package Core_Automation_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import utility.property_file;

public class read_data_from_propertyfile {

	public static void main(String[] args) throws IOException {
		String file_path = "E:\\Accelaration Class 16th nov Automation and Manual Testing\\Automation Testing\\Work Place Java\\Java_Basic_Program\\filehandle_propertis\\filehandle.properties";
        /*Steps
         * Stores the path or file location in any string 
         * created object of the FileInptStream and that constructor pass location
         * create the Properties file object to load the propertis file 
         * and finally load the properties file by using its alieas name
         * to get the property file data by using the prop.getproperty("Key"); 
         */
		FileInputStream fis = new FileInputStream(file_path);
		Properties prop = new Properties();
		prop.load(fis);
		
		String password = prop.getProperty("password");
		System.out.println("The password is ="+password);
		System.out.println("By using utility");
		property_file.get_data("E:\\\\Accelaration Class 16th nov Automation and Manual Testing\\\\Automation Testing\\\\Work Place Java\\\\Java_Basic_Program\\\\filehandle_propertis\\\\filehandle.properties");
	    String username = prop.getProperty("Username");
		System.out.println("The username is  = "+username);
	}

}
