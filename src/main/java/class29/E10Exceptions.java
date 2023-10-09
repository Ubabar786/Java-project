package class29;

import java.io.FileInputStream;
import java.io.IOException;

public class E10Exceptions {
    public static void main(String[] args) {

        try(FileInputStream fis=new FileInputStream("C:\\Users\\babar\\Downloads\\Employees.xlsx\\")){

        }catch(IOException f){
            System.out.println("Please check the file path");
        }
    }
}
