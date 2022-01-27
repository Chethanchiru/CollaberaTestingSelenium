package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadDataFromCSVFile {

	public static void main(String[] args) throws IOException {

		 // we need to create a file for CSV with extension.csv and we need right click on the file and select pen with Text editor
		FileReader fre=new FileReader("./testResources/testData.csv");

		CSVReader csvReader = new CSVReader(fre);// we cannot pass fileInputStream object reference into the CSVReader() bcz it will only accept fileReader object reference

		String[] Data = csvReader.readNext();
		
		for(String d1 : Data ) {
			System.out.println(d1);
		}

		System.out.println(Data);// it will be printing [Ljava.lang.String;@355da254 want to cross verify it.

		List<String[]> allData = csvReader.readAll();

		for(String[] sarr : allData) {
			for(String d : sarr) {
				System.out.println(d);
			}
		}
	}
}
