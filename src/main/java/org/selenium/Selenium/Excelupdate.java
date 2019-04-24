package org.selenium.Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelupdate {

	public static void main(String[] args) throws IOException {
		File loc=new File("D:\\eclipse-java-2018-12-R-win32-x86_64\\eclipse\\swathi\\Selenium\\excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(loc);
 	    Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");	
Row r = s.getRow(2);
Cell c = r.getCell(2);
String st = c.getStringCellValue();
if(st.equals("Kavali")) {
c.setCellValue("Buchi");
}
FileOutputStream f1=new FileOutputStream(loc);
w.write(f1);
System.out.println("done");

	}

}
