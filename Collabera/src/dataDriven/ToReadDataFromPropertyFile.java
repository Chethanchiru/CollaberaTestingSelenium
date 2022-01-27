package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//************ FileInputStream ***********//
		
		FileInputStream fis=new FileInputStream("./testResources/testData.properties");

		Properties properties= new Properties();

		properties.load(fis);

		System.out.println(properties.getProperty("Username"));

		//************ FileReader ***********//
		
		FileReader fre=new FileReader("./testResources/testData.properties");

		Properties properties1 = new Properties();

		properties1.load(fre);

		System.out.println(properties1.getProperty("URL"));


	}

}
