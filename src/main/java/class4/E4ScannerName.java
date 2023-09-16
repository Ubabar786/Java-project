package class4;

import java.util.Scanner;

public class E4ScannerName {
    public static void main(String[] args) {
        System.out.println("Please enter your name");

        // creating the object of the Scanner class
        // so that we can reuse the logic from
        // this class which is already written for us by Java developers
        Scanner input = new Scanner(System.in);

        // taking an input form the user
        // storing it into a name variable
        String name = input.next();
        if (name.equals("Uzair")) {
            System.out.println("Java instructor");
        } else {
            System.out.println("I don't know you");
        }
        //System.out.println("Hello "+name);
    }
}
