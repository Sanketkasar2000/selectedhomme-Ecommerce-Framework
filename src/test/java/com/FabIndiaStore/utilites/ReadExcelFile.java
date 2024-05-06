package com.FabIndiaStore.utilites;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public static FileInputStream inputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet excelSheet;
	public static XSSFRow excelRow;
	public static XSSFCell Cell;

	public static String getCellvalueString(String fileName, String sheetName, int rowno, int cellno)
			throws IOException {

		try {
			inputStream = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(sheetName);
			Cell = workbook.getSheet(sheetName).getRow(rowno).getCell(cellno);

			workbook.close();
			return Cell.getStringCellValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "";
		}

	}

	public static int getRowCount(String fileName, String SheetName) {
		try {
			inputStream = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(SheetName);
			int rowTotalNum = excelSheet.getLastRowNum() + 1;
			workbook.close();

			return rowTotalNum;

		} catch (Exception e) {
			return 0;

		}

	}

	public static int getColumCount(String fileName, String SheetName) {
		try {
			inputStream = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(SheetName);
			int cellTotalNum = excelSheet.getRow(0).getLastCellNum();
			workbook.close();
			return cellTotalNum;

		} catch (Exception e) {
			return 0;
		}

	}

}
