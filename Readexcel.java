package seleniumproject12;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class Readexcel {

	public static void main(String[] args) {
		
		try {
            // Path to the Excel file
            String filePath = "C:\\Users\\Admin\\Desktop\\Myexcel.xlsx";

            // Create a FileInputStream to read the Excel file
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Create a Workbook instance for the Excel file
            Workbook workbook = WorkbookFactory.create(fileInputStream);

            // Get the first sheet in the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate over rows
            for (Row row : sheet) {
                // Iterate over cells in each row
                for (Cell cell : row) {
                    // Retrieve the cell value and print
                    CellType cellType = cell.getCellType();
                    if (cellType == CellType.STRING) {
                        System.out.print(cell.getStringCellValue() + "\t");
                    } else if (cellType == CellType.NUMERIC) {
                        System.out.print(cell.getNumericCellValue() + "\t");
                    } else if (cellType == CellType.BOOLEAN) {
                        System.out.print(cell.getBooleanCellValue() + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println(); // Move to the next line for the next row
            }

            // Close the workbook and file stream
            workbook.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
		// TODO Auto-generated method stub

	}

}
