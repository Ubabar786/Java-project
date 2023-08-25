package class6;

import java.util.Scanner;

public class E12DoWhileLoop {
    public static void main(String[] args) {
        //Why do while is better than while loop; check E13
        Scanner scanner = new Scanner(System.in);

        int input;

        do {
            System.out.println("Enter your number and -1 to terminate");
            input = scanner.nextInt();
            System.out.println("You have entered " +input);
        } while (input != -1);


    }
}
