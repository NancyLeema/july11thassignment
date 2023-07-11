package seleniumproject12;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;



public class Writeread {

	public static void main(String[] args) {
		 XSSFWorkbook workbook = new XSSFWorkbook();
		  
	        // Creating a blank Excel sheet
	        XSSFSheet sheet
	            = workbook.createSheet("Work Details");
	  
	        // Creating an empty TreeMap of string and Object][]
	        // type
	        Map<String, Object[]> data
	            = new TreeMap<String, Object[]>();
	  
	        // Writing data to Object[]
	        // using put() method
	        data.put("1",
	                 new Object[] { "ID", "STUDENTNAME", "LASTNAME", });
	        data.put("2",
	                 new Object[] { 1, "NancyLeema", "Karunakaran" });
	        data.put("3",
	                 new Object[] { 2, "Riya", "T" });
	        data.put("4", new Object[] { 3, "QT", "Class" });
	        data.put("5", new Object[] { 4, "Abdul", "Kalam" });
	        data.put("6", new Object[] { 5, "Galileo", "Galilee" });
	        // Iterating over data and writing it to sheet
	        Set<String> keyset = data.keySet();
	  
	        int rownum = 0;
	  
	        for (String key : keyset) {
	  
	            // Creating a new row in the sheet
	            Row row = sheet.createRow(rownum++);
	  
	            Object[] objArr = data.get(key);
	  
	            int cellnum = 0;
	  
	            for (Object obj : objArr) {
	  
	                // This line creates a cell in the next
	                //  column of that row
	                Cell cell = row.createCell(cellnum++);
	  
	                if (obj instanceof String)
	                    cell.setCellValue((String)obj);
	  
	                else if (obj instanceof Integer)
	                    cell.setCellValue((Integer)obj);
	            }
	        }
	  
	        // Try block to check for exceptions
	        try {
	  
	            // Writing the workbook
	            FileOutputStream out = new FileOutputStream(
	                new File("C:\\Users\\Admin\\Desktop\\Myexcel.xlsx"));
	            workbook.write(out);
	  
	            // Closing file output connections
	            out.close();
	  
	            // Console message for successful execution of
	            // program
	            System.out.println(
	                "QT.xlsx written successfully on disk.");
	        }
	  
	        // Catch block to handle exceptions
	        catch (Exception e) {
	  
	            // Display exceptions along with line number
	            // using printStackTrace() method
	            e.printStackTrace();
	        }
	        
	        
	        
	        
	    }
	
	
	
		// TODO Auto-generated method stub

	}


