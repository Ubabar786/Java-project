package class4;

import java.util.Scanner;

public class H1Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter amount of Loan you want");

        double amountLoan = scanner.nextDouble();
        if (amountLoan <= 200000) {
            System.out.println("You fit the criteria");

        } else {
            System.out.println("We have to reject you");
        }
    }
}