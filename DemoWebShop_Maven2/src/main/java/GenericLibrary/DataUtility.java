package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	
		public String getDataFromProperty(String key) throws IOException {
			FileInputStream f = new FileInputStream(FrameWorkConstants.Properties_path);
			Properties p = new Properties();
			p.load(f);
			return p.getProperty(key);
		
		}


	public static void getDataFromExcel(String sheetname , int rownum , int colnum ) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(FrameWorkConstants.excel_path);
		Workbook workbook = WorkbookFactory.create(f1);
		Sheet sheet = workbook.getSheet(sheetname);
		sheet.getRow(rownum).getCell(colnum);
	}


	public static Object[][] getAllDataFromExcel(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(FrameWorkConstants.DemoWebShop_excel_path);
		Workbook workbook = WorkbookFactory.create(f1);
		Sheet sheet = workbook.getSheet(sheetname);
		int lastRowNum = sheet.getPhysicalNumberOfRows();
		int lastCellNum = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] arr = new Object[lastRowNum - 1 ][lastCellNum];
		
		for(int i=1 ; i < lastRowNum ; i++ ) {
			for(int j=0;j<lastCellNum;j++) {
				arr[i-1][j] = sheet.getRow(i).getCell(j).toString();
		}
		
	}
		return arr;
}}
