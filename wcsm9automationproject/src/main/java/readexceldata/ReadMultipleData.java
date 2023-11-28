package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//provide the path of excel file
		FileInputStream fis = new FileInputStream("./src/main/resources/TestDeta.xlsx");
		//to make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");//to get into particular sheet
		int rc = sheet.getLastRowNum();//to get the no of rows
		
		
		for(int i =1; i<=rc; i++) {
			
			
			Row row = sheet.getRow(i);//to get into particular row
			row.getCell(0);
		}
	}

}
