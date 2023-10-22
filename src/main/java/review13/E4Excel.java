package review13;

import utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class E4Excel {
    public static void main(String[] args) {

        List<Map<String, String>> data= ExcelReader.readExcelData("C:\\Users\\babar\\IdeaProjects\\untitled1\\Files\\Employees.xlsx", "Sheet1");
        System.out.println(data);
    }
}
