package dataProvider;

import library.ExcelDataConfig;

public class ReadExcelFromLib {

	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\imran\\Desktop\\Helal Edited\\ReadFile.xlsx");
		
		System.out.println(excel.getData(0, 0, 1));
	

	}

}
