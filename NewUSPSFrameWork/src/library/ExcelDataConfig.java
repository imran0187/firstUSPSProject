package library;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet_1;
	public ExcelDataConfig(String excelPath) {
		
		try {
			File src = new File(excelPath); // import a file class and define path

			FileInputStream fis = new FileInputStream(src);


			wb = new XSSFWorkbook(fis); // load workbook as xssf for xlsx
			sheet_1 = wb.getSheetAt(0);
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	public  String getData(int sheetNum, int rowNum, int colNum) {
		sheet_1 = wb.getSheetAt(sheetNum); // index 0 means first page of exel file
		String data = sheet_1.getRow(rowNum).getCell(colNum)
				.getStringCellValue();

		return data;
	}
	public int getRowCount(int sheetIndex) {
	 int row =	wb.getSheetAt(sheetIndex).getLastRowNum();
	 
	 return row + 1;
		
	}

}
