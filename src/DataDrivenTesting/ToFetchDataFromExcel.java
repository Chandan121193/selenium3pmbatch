package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcel {
	public static void main(String[] args) throws IOException {
		 FileInputStream fis = new FileInputStream("./PropertyDataSept/Book1.xlsx");
		 Workbook workbook1 = WorkbookFactory.create(fis);
		 
		 Sheet sheet = workbook1.getSheet("sheet1");
		   Row row = sheet.getRow(1);
		  Cell cell = row.getCell(0);
		 String url = cell.getStringCellValue();
		 System.out.println(url);
		 
		 String username = row.getCell(1).toString();
		 String password = row.getCell(2).toString();
		 System.out.println(username);
		 System.out.println(password);
		 
		double num = row.getCell(3).getNumericCellValue();
		boolean boo = row.getCell(4).getBooleanCellValue();
		 System.out.println(num);
		 System.out.println(boo);
	}

}
