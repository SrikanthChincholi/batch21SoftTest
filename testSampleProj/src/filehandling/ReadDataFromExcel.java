package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	static String filepath = System.getProperty("user.dir") + "//DataFiles//TestData.xlsx";
	static FileInputStream fis;

	public static void main(String[] args) throws IOException {
		fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("TestData");

		int nooforows = sh.getPhysicalNumberOfRows();
		int noofcols = sh.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < nooforows; i++) {
			XSSFRow row = sh.getRow(i);
			for (int j = 0; j < noofcols; j++) {
				XSSFCell cell = row.getCell(j);
				if (cell.getCellType() == CellType.STRING) {
					System.out.print(cell.getStringCellValue() + " ");
				} else if (cell.getCellType() == CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue()+ " ");
				}

			}
			System.out.println("");
		}

	}

}
