package class4;

import java.util.Scanner;

public class H2DMV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your age");

        int age=scanner.nextInt();
        if(age>=18)   {
            System.out.println("We are able to issue you a driving licence");

        }else   {
            System.out.println("We can offer you a learners permit only");
        }
    }
}
