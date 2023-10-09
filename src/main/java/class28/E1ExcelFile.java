package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\babar\\IdeaProjects\\untitled1\\Files\\Employees.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");

        for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
            //getting all of the rows one by one and placing them inside the row variable
            Row row = sheet1.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }
    }
}

