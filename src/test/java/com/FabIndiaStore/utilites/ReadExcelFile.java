package com.FabIndiaStore.utilites;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public static FileInputStream inputstream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet excelsheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static String getCellvalue(String FileName, String sheetName, int rowNo, int cellNo) {
		try {
			inputstream = new FileInputStream(FileName);
			workbook = new XSSFWorkbook(inputstream);
			excelsheet = workbook.getSheet(sheetName);
			cell = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
			workbook.close();
			return cell.getStringCellValue();

		} catch (Exception e) {
			return "";
		}
	}

	public static int getRowCount(String FileName, String sheetName) {
		 try {
		        System.out.println("Filename: " + FileName);
		        System.out.println("Sheetname: " + sheetName);
		        
		        inputstream = new FileInputStream(FileName);
		        workbook = new XSSFWorkbook(inputstream);
		        excelsheet = workbook.getSheetAt(0);

		        if (excelsheet == null) {
		            System.out.println("Sheet is null.");
		        } else {
		            System.out.println("Sheet is not null.");
		        }
		        System.out.println(excelsheet.getLastRowNum());

		        int totalRow = excelsheet.getLastRowNum() + 1;
		        workbook.close();
		        return totalRow;
		    } catch (Exception e) {
		        e.printStackTrace();
		        return 0;
		    }

	}
	
	public static int getColCount(String FileName, String sheetName) {
		try {
	        inputstream = new FileInputStream(FileName);
	        workbook = new XSSFWorkbook(inputstream);
	        excelsheet = workbook.getSheet(sheetName);
	        
	        // Get the first row
	        XSSFRow firstRow = excelsheet.getRow(0);
	        int totalCol = 0;
	        if (firstRow != null) {
	            // Iterate over the cells in the first row and count non-empty cells
	            for (int i = 0; i < firstRow.getLastCellNum(); i++) {
	                if (firstRow.getCell(i) != null && !firstRow.getCell(i).toString().isEmpty()) {
	                    totalCol++;
	                }
	            }
	        }
	        
	        workbook.close();
	        System.out.println(totalCol);
	        return totalCol;
	        
	    } catch (Exception e) {
	        return 0;
	    }
}
}