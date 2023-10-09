package class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4 {
    public static class E4ExcelFile {
        public static void main(String[] args) throws IOException {
            String path="C:\\Users\\babar\\IdeaProjects\\untitled1\\Files\\Employees.xlsx";
            FileInputStream fis = new FileInputStream(path);
            Properties prop=new Properties();
            XSSFWorkbook workbook= new XSSFWorkbook(fis);
            Sheet sheet1 = workbook.getSheet("Sheet1");

            Row row =sheet1.getRow(1);
            Cell cell=row.getCell(0);
            System.out.println(cell);
        }
    }
}
