package org.selenium.Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenExcel {
	public static void main(String[] args) throws IOException {
		File loc=new File("D:\\eclipse-java-2018-12-R-win32-x86_64\\eclipse\\swathi\\MavenPractice\\excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(loc);
 	    Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");	
		for (int k = 0; k < s.getPhysicalNumberOfRows(); k++) {
			Row r = s.getRow(k);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c1 = r.getCell(j);
				int i = c1.getCellType();				
				if (i==1) {
					String value = c1.getStringCellValue();
					System.out.println(value);					
				}
				if (i==0) {
					double d = c1.getNumericCellValue();
					long l=(long)d;
					String val = String.valueOf(l);
					System.out.println(val);
				}
			}
	}
	}
}
