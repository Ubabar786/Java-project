package class6;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
//this is why we use do while instead of while loop; check E12.
        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Please enter a number or -1 to terminate");
        i = scanner.nextInt();
        System.out.println("You have entered" + i);

        while (i != -1) {
            System.out.println("Please enter a number or -1 to terminate");
            i = scanner.nextInt();
            System.out.println("You have entered" + i);

        }
    }
}
