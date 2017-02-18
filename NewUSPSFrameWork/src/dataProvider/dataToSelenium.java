package dataProvider;

import org.testng.annotations.DataProvider;

import library.ExcelDataConfig;

public class dataToSelenium {
	@DataProvider (name="USPS")
	public Object [][] passData() {
		
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\imran\\Desktop\\Helal Edited\\ReadFile.xlsx");
		
		 int rows= config.getRowCount(0);
		 Object [][] data = new Object [rows][2];
		 
		 for(int i = 0; i<= rows; i++) {
			 data[i][0] = config.getData(0, 1, 1);
		 }
		 
		 
		 
		 
		 return data;
	}


}
