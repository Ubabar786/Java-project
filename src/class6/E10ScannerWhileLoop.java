package class6;

import java.util.Scanner;

public class E10ScannerWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a starting point");
        int start = scanner.nextInt();
        System.out.println("Please enter the ending point");
        int end = scanner.nextInt();
        System.out.println("Please enter the step point");
        int step = scanner.nextInt();

        while (start <= end) {
            System.out.println(start);

            start += step;

        }
    }
}
