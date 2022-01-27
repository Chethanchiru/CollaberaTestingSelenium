package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./testResources/testData.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);

		Sheet SheetFive = workbook.getSheet("Sheet6");
		int rowCount = SheetFive.getPhysicalNumberOfRows();
		int colCount = SheetFive.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(colCount);

		String [] [] sarr = new String[rowCount] [colCount];

		for(int i=0; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				sarr[i][j] = SheetFive.getRow(i).getCell(j).toString();
			}
		}

		for(String[] arr : sarr) {
			for(String s : arr) {
				System.out.print(s+ " , ");
			}
			System.out.println();
		}

	}

}
