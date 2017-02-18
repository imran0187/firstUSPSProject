package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	static XSSFSheet sheet_1;
	static XSSFWorkbook wb;

	public ReadExcelFile(String path) throws Exception {

		File src = new File(path); // import a file class and define path

		FileInputStream fis = new FileInputStream(src);

		wb = new XSSFWorkbook(fis); // load workbook as xssf for xlsx

		int row_Count = sheet_1.getLastRowNum();
		System.out.println(row_Count + " total row");

		wb.close(); // to avoid memory leak

	}

}
