package practice_programs;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DataDr_PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fre=new FileReader("./testResources/testData.properties");
		
		Properties properties = new Properties();
		
		properties.load(fre);
		
		System.out.println(properties.getProperty("URL"));
		
		FileInputStream fis=new FileInputStream("./testResources/testData.properties");
		
		Properties properties1=new Properties();
		
		properties1.load(fis);
		
		System.out.println(properties.getProperty("Company", "Test Yantra Software Solutions"));
		
		System.out.println(properties.getProperty("Company"));
	}

}
