package Practise;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings({ "unused", "unused" })
public class Excel {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet=workbook.getSheet("sheet1");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowCount();
	}
	
			public static void getRowCount() {
		try {
			@SuppressWarnings("resource")
			workbook=new XSSFWorkbook("C:\\Users\\ankita_rawat\\eclipse-workspace\\CodeWritingPractise\\src\\Practise\\testdata.xlsx");
			XSSFSheet sheet=workbook.getSheet("sheet1");
			int rowCount =  sheet.getPhysicalNumberOfRows();
		
			System.out.println(rowCount);
		}
		catch(IOException e)
		{
			System.out.println("rowCount");	
		}
		public static  void getCellData() {
			try {
				@SuppressWarnings("resource")
				workbook=new XSSFWorkbook("C:\\Users\\ankita_rawat\\eclipse-workspace\\CodeWritingPractise\\src\\Practise\\testdata.xlsx");
				XSSFSheet sheet=workbook.getSheet("sheet1");
				int getdell =  sheet.getRow(rownum);
			
				System.out.println(getcell);
			}
			catch(IOException e)
			{
				System.out.println("rowCount");	
			}
		}
		
	}