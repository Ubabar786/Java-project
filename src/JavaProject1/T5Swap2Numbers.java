package JavaProject1;

import java.util.Scanner;

public class T5Swap2Numbers {
    public static void main(String[] args) {
        // Write a program to swap 2 numbers without a temporary variable?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] array = {a, b};
        a = array[1];
        b = array[0];

        System.out.println(a + " " + b);
    }
}
