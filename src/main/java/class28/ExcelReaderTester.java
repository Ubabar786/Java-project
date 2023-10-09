package class28;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public ExcelReaderTester() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        List<Map<String, String>> data = ExcelReader.readExcelData("C:\\Users\\babar\\IdeaProjects\\untitled1\\Files\\Employees.xlsx", "sheet1");
        System.out.println(data.get(1));

        List<Map<String, String>> data1 = ExcelReader.readExcelData("C:\\Users\\babar\\IdeaProjects\\untitled1\\Files\\Sales.xlsx", "Sheet1");
        System.out.println(data1);
    }
}
