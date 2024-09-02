package simpleProject;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("F:\\SELENIUM\\A4.xlsx");
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	sh.createRow(9).createCell(0).setCellValue("angrybird");
	FileOutputStream fos=new FileOutputStream("F:\\SELENIUM\\A4.xlsx");
	book.write(fos);
}
}
