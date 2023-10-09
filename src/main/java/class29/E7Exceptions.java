package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E7Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("1");

        int num1=10;
        int num2=0;

        if(num2!=0){
            System.out.println(num1/num2);
        }
        System.out.println(10/0);
        int[] arr=new int[-5];

        FileInputStream f=new FileInputStream("C://sds");
    }
}
