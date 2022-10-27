package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataToExcelSheet {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./PropertyDataSept/Book1.xlsx");
		Workbook workbook1 = WorkbookFactory.create(fis);
		
		workbook1.getSheet("Sheet1").getRow(1).createCell(5).setCellValue("Qspiders");
		
		 FileOutputStream fos = new FileOutputStream("./PropertyDataSept/Book1.xlsx");
		 workbook1.write(fos);
		 System.out.println("The data has updated");
		 workbook1.close();
	}

}
