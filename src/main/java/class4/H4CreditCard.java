package class4;

import java.util.Scanner;

public class H4CreditCard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you have a Credit Card type 'Y' for Yes and 'N' for No");

        char value = scanner.next().charAt(0);
        if (value == 'Y') {
            System.out.println("Please enter the balance of your Credit Card");

            double balance = scanner.nextDouble();
            if (balance > 1000) {
                System.out.println("Please pay immediately");

            } else {
                System.out.println("You can spend more");

            }

        } else if (value=='N') {
            System.out.println("We can offer you a Credit Card");

        }
    }
}
