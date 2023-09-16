package review3;

import java.util.Scanner;

public class E7DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        do {
            System.out.println("Please enter price of item or -1 to terminate");
            i = scanner.nextInt();
            if (i != -1) {
                sum = sum + i;
                System.out.println("Your total bill is " + sum);
            }

            }while (i != -1);
        }
    }

