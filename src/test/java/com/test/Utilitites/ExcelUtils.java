package com.test.Utilitites;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {

	private HSSFWorkbook workbook;
	private HSSFSheet sheet;
	private HSSFCell cell;
	
	
	public HSSFSheet openSheet(String fileName,String sheetName)
	{
		File file=new File(fileName);
		try
		{
			FileInputStream fis=new FileInputStream(file);
			workbook=new HSSFWorkbook(fis);
			sheet=workbook.getSheet(sheetName);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sheet;
	}
	public HSSFSheet openSheet(String fileName,int sheetNumber)
	{
		File file=new File(fileName);
		try
		{
			FileInputStream fis=new FileInputStream(file);
			workbook=new HSSFWorkbook(fis);
			sheet=workbook.getSheetAt(sheetNumber);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sheet;
	}
	public int getTotalRows(String fileName,String sheetName)
	{
		int totRows=0;
		try
		{
			totRows=openSheet(fileName,sheetName).getPhysicalNumberOfRows();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return totRows;
	}
	public int getTotalRows(String fileName,int sheetNumber)
	{
		int totRows=0;
		try
		{
			totRows=openSheet(fileName,sheetNumber).getPhysicalNumberOfRows();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return totRows;
	}

	public String getStringValue(String fileName,String sheetName,int row,int col)
	{
		String value=null;
		try
		{
			value=openSheet(fileName,sheetName).getRow(row).getCell(col).getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	public String getStringValue(String fileName,int sheetNumber,int row,int col)
	{
		String value=null;
		try
		{
			value=openSheet(fileName,sheetNumber).getRow(row).getCell(col).getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	public int getIntValue(String fileName,String sheetName,int row,int col)
	{
		int value=0;
		try
		{
			value=(int) openSheet(fileName,sheetName).getRow(row).getCell(col).getNumericCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	public int getIntValue(String fileName,int sheetNumber,int row,int col)
	{
		int value=0;
		try
		{
			value=(int) openSheet(fileName,sheetNumber).getRow(row).getCell(col).getNumericCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	
	public void writeToWorkbook(String fileName,String sheetName, int row,int col,String message)
	{
		
		try
		{
		FileOutputStream fos=new FileOutputStream(fileName);
		cell=openSheet(fileName,sheetName).getRow(row).createCell(col);
		cell.setCellValue(message);
		workbook.write(fos);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeToWorkbook(String fileName,int sheetNumber, int row,int col,String message)
	{
		
		try
		{
		FileOutputStream fos=new FileOutputStream(fileName);
		cell=openSheet(fileName,sheetNumber).getRow(row).createCell(col);
		cell.setCellValue(message);
		workbook.write(fos);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
