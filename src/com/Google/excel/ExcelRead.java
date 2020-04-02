package com.Google.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("TestData/MagentoData.xlsx"); //read and location
		
		XSSFWorkbook book=new XSSFWorkbook(file); //open 
		
		XSSFSheet sheet = book.getSheet("InvalidCredentialTest");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		XSSFRow rowCheck = sheet.getRow(0);
		
		int cellCount = rowCheck.getPhysicalNumberOfCells();
		System.out.println(cellCount);
		
		DataFormatter format=new DataFormatter();
		
		String[][] main = new String[rowCount-1][cellCount];
		
		//print each cell value
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell= row.getCell(j);
				String value = format.formatCellValue(cell);
				//System.out.println(value);
				main[i-1][j]=value;
			}
		}
		
		//sheet into string[][]
		
		book.close();
		
		file.close();
		
		
		
	}

}
