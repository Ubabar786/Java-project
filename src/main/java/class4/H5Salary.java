package class4;

import java.util.Scanner;

public class H5Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of years worked");

        int noOfWrkdYrs = scanner.nextInt();
        System.out.println("Enter the annual salary");

        double annualSalary = scanner.nextDouble();
        if (noOfWrkdYrs >= 5) {
            System.out.println("Employee is eligible for a bonus");

            if (annualSalary >= 50000) {
                System.out.println("Bonus will be 5000");
            } else {
                System.out.println("Bonus will be 3000");
            }
        }
        else   {
            System.out.println("You are not eligible for a bonus");
        }
    }
}


