package genericutil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericWayToWriteInExcel {

public static void writeExcelDAta(String sheetName,int rowNum,int cellNum,String value) throws IOException {
	FileInputStream fis=new FileInputStream(Iconstantutil.excelPath);
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetName);
	sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
	FileOutputStream fos=new FileOutputStream(Iconstantutil.excelPath);
	book.write(fos);
	
	
}
}
