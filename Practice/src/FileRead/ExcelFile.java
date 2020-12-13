package FileRead;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFile {

	static Scanner s = new Scanner(System.in);
	static String path = "../Practice/TestData.xls";

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		ExcelFile obj = new ExcelFile();
//		obj.ExRead();
//		obj.ReadDataBasedUponRowAndColumnNo();
//		obj.ReadDataBasedUponRowNo(path);
//		obj.RangeRead(path);
//		obj.WriteData();
		obj.CopyPaste();

	}

	public void ExRead() throws BiffException, IOException {
		File f = new File("../Practice/TestData.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int row = s.getRows();
		int col = s.getColumns();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Cell c = s.getCell(j, i);
				System.out.print(" " + c.getContents());
			}
		}

	}

	public void ReadDataBasedUponRowAndColumnNo() throws BiffException, IOException {
		File f = new File("../Practice/TestData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s = wk.getSheet(0);
		int row = s.getRows();
		int col = s.getColumns();
		int readRow;
		int readCol;
		System.out.println("Please Enter row");
		readRow = this.s.nextInt();
		System.out.println("Please enter the column from where you want to read");
		readCol = this.s.nextInt();
		for (int i = 0; i < row; i++) {
			if (i == readRow) {
				for (int j = 0; j < col; j++) {
					if (j == readCol) {
						Cell c = s.getCell(j, i);
						System.out.println(c.getContents());
					}
				}
			}
		}
	}

	public void ReadDataBasedUponRowNo(String Path) throws BiffException, IOException {
		File f = new File(Path);
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s = wk.getSheet(0);
		int row = s.getRows();
		int col = s.getColumns();
		int readRow;
		System.out.println("Please enter the row that you want to read from");
		readRow = this.s.nextInt();
		for (int i = 0; i < row; i++) {
			if (i == readRow) {
				for (int j = 0; j < col; j++) {
					Cell c = s.getCell(j, i);
					System.out.println(c.getContents());
				}
			}
		}
	}

	public void RangeRead(String FilePath) throws BiffException, IOException {
		File f = new File(FilePath);
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int row = s.getRows();
		int col = s.getColumns();
		int RowStart, rowEnd;
		System.out.println("Please enter the row from where you want to read from");
		RowStart = this.s.nextInt();
		System.out.println("Please enter the row from where you want to end read ");
		rowEnd = this.s.nextInt();
		for (int i = 0; i < row; i++) {
			if (i >= RowStart && i <= rowEnd) {
				for (int j = 0; j < col; j++) {
					Cell c = s.getCell(j,i);
					System.out.println("String at row: "+i+" and column: "+j+" is:"+ c.getContents());
				}
			}
		}

	}

	public void WriteData() throws BiffException, IOException, RowsExceededException, WriteException {
		File f = new File("../Practice/TestData1.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("WriteSheet01", 0);
		int numRow, numCol;
		System.out.println("Please enter the number of rows in which you want to enter data");
		numRow = this.s.nextInt();
		System.out.println("Please enter the number of columns in which you want to enter data");
		numCol = this.s.nextInt();
		String write;
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {
				System.out.println("Please enter the value of row: " + i + " and column: " + j);
				write = this.s.next();
				Label l = new Label(j, i, write);
				ws.addCell(l);
			}
		}
		wk.write();
		wk.close();
	}

	public void CopyPaste() throws BiffException, IOException, RowsExceededException, WriteException {
		File f = new File("../Practice/TestData1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);

		File f1 = new File("../Practice/TestData2.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f1);
		WritableSheet wrs = ww.createSheet("WriteRead", 0);
		int row = ws.getRows();
		int col = ws.getColumns();
		String write;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Cell cell = ws.getCell(j, i);
				write = cell.getContents();
				Label l = new Label(j, i, write);
				wrs.addCell(l);
			}
		}
		ww.write();
		ww.close();
		System.out.println("Read write operation is completed");
	}

}
