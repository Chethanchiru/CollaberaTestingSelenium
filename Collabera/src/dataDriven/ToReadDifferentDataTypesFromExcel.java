package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDifferentDataTypesFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./testResources/testData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Row row9 = workbook.getSheet("Sheet1").getRow(9);
		
		String Data1 = row9.getCell(3).getStringCellValue();
		boolean Data2 = row9.getCell(4).getBooleanCellValue();
		double Data3 = row9.getCell(5).getNumericCellValue();
		LocalDateTime Data4 = row9.getCell(6).getLocalDateTimeCellValue();
		
		System.out.println(Data1+ " , " +Data2+ " , "  +Data3+ " , " +Data4);
		
	}

}
