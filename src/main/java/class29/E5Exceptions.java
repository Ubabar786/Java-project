package class29;

import java.util.Scanner;

public class E5Exceptions {
    public static void main(String[] args) {

        System.out.println("a");
        System.out.println("a");
        System.out.println("a");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        try {
            //plan A
            int size = scanner.nextInt();
            int[] arr = new int[size];
        }catch (Exception e){
            //Plan B
            System.out.println("User must only enter a positive integer number");
        }

        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
    }
}
