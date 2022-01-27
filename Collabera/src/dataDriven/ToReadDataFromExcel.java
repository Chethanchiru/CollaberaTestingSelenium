package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		// if we create an testData.xlsx file in selenium it will be not saved properly so go the testResource location and create an excel file
		// there itself and write the data into the file and save, close it and refresh it in selenium testResource and run the program.
		// if we have opened excel sheet and try to run we will get error.
		
		FileInputStream fis=new FileInputStream("./testResources/testData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);// if will accept only FileInputStream object reference not FileReader object reference
		
		String data = workbook.getSheet("Sheet1").getRow(15).getCell(7).toString();// always in excel sheet row and cell will start from 0,0.
		
		System.out.println(data);
		
		System.out.println(workbook.getSheet("Sheet3").getRow(6).getCell(10).getDateCellValue());
		System.out.println(workbook.getSheet("Sheet3").getRow(6).getCell(10).getLocalDateTimeCellValue());
		System.out.println(workbook.getSheet("Sheet3").getRow(11).getCell(5).getNumericCellValue());// it will return the value in the form of double.
		System.out.println(workbook.getSheet("Sheet2").getRow(25).getCell(6).getStringCellValue());
		System.out.println(workbook.getSheet("Sheet2").getRow(4).getCell(11).getBooleanCellValue());
		
	}

}
