package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E9Exceptions {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\babar\\Downloads\\Employees.xlsx\\");

        } catch (FileNotFoundException f) {
            System.out.println("Please check the file path");
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
