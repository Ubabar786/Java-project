package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your full name");

        String name=scanner.nextLine();
        System.out.println("Your full name is "+name);
    }
}
