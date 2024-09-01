package Java_programs_practice_Manali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties_file {

	public static void main(String[] args) throws IOException  {
		String path = "E:\\Accelaration Class 16th nov Automation and Manual Testing\\Automation Testing\\Work Place Java\\Testing_Framework_And_Api_Testing\\src\\filehandling\\properties_file\\property.properties";
		
		FileInputStream file =  new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(file);
        System.out.println(prop.get("Username"));
        System.out.println(prop);
	}

}
