package org.selenium.Selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		File loc=new File("D:\\eclipse-java-2018-12-R-win32-x86_64\\eclipse\\swathi\\Selenium\\excel\\Hello.xlsx");

 	    Workbook w=new XSSFWorkbook();
		Sheet s = w.getSheet("Test");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Selenium");
		FileOutputStream f1=new FileOutputStream(loc);
		w.write(f1);
		System.out.println("done");

	}

}
