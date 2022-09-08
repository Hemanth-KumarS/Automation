package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author ADMIN
 *
 */
public class fileLib {
/**
 * 
 * @param key
 * @return
 * @throws IOException
 */
	public String getPropertyData(String key) throws IOException {

		FileInputStream fis=new FileInputStream("./data/ActiTimeCommonData.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;

	}
/**
 * 
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public  String getExcleData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String  data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;

	}
/**
 * 
 * @param sheetname
 * @param row
 * @param cell
 * @param text
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public void setExcelData(String sheetname, int row, int cell, String text) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./data/TestScript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(text);
		 
		 FileOutputStream fos= new FileOutputStream("./data/TestScript.xlsx");
		 wb.write(fos);
		 wb.close();
	}
	

}
