package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void paricular_Cell_Data() throws IOException {

		File f = new File("C:\\eclipse\\Project_Maven\\Trial.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
        Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(3);
		Cell c = r.getCell(2);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {
			String sc = c.getStringCellValue();
			System.out.println(sc);
		} else if (ct.equals(CellType.NUMERIC)){
            double nc = c.getNumericCellValue();
          int value  =(int) nc;
          System.out.println(value);

		}
		wb.close();
		System.out.println("*********************");

	}
	
	public static void all_Data() throws IOException {
		File f = new File("C:\\eclipse\\Project_Maven\\Trial.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
        Sheet s = wb.getSheetAt(0);
        
        for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
    		Row r = s.getRow(i);
    		
        for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
        	Cell c = r.getCell(j);
    		CellType ct = c.getCellType();
    		if (ct.equals(CellType.STRING)) {
    			String sc = c.getStringCellValue();
    			System.out.println(sc);
    		} else if (ct.equals(CellType.NUMERIC)){
                double nc = c.getNumericCellValue();
              int value  =(int) nc;
              String string = Integer.toString(value);
              System.out.println(string);
    		}
    		wb.close();

}
		}
		System.out.println("*********************");

	}
	
   public static void particular_Row_Data() throws IOException {
	   
	File f = new File("C:\\eclipse\\Project_Maven\\Trial.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fi);
    Sheet s = wb.getSheetAt(0);
	Row r = s.getRow(2);
	
	for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
		Cell c = r.getCell(i);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {
			String sc = c.getStringCellValue();
			System.out.println(sc);
		} else if (ct.equals(CellType.NUMERIC)){
            double nc = c.getNumericCellValue();
          int value  =(int) nc;
          String string = Integer.toString(value);
          System.out.println(string);
		}
		wb.close();
	}
	System.out.println("*********************");

}
   public static void particular_Column_Data() throws IOException {

	   File f = new File("C:\\eclipse\\Project_Maven\\Trial.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
	    Sheet s = wb.getSheetAt(0);
	    
	    for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(0);
			CellType ct = c.getCellType();
			if (ct.equals(CellType.STRING)) {
				String sc = c.getStringCellValue();
				System.out.println(sc);
			} else if (ct.equals(CellType.NUMERIC)){
	            double nc = c.getNumericCellValue();
	          int value  =(int) nc;
	          String string = Integer.toString(value);
	          System.out.println(string);
			}
			wb.close();

		}
	    
		}
		
	public static void main(String[] args) throws IOException {
		
		paricular_Cell_Data();
		all_Data();
		particular_Row_Data();
		particular_Column_Data();

	}
	}
