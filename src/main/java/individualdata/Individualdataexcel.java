package individualdata;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Individualdataexcel {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("F:\\SELENIUM\\A4.xlsx");
     Workbook book=	WorkbookFactory.create(fis);
     Sheet sh=book.getSheet("Sheet1");
     DataFormatter format=new DataFormatter();
     String value=format.formatCellValue(sh.getRow(3).getCell(0));
     System.out.println(value);
     
}
}
