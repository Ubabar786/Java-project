package class12;

import java.util.Scanner;

public class Calculator {

    void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of these numbers is " + sum);

    }
    void subtract(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Subtraction of these numbers is " + sum);
    }
    void multiply(int number1, int number2){

        int result=number1*number2;
        System.out.println(result);
    }
    void twoNumbers(int number1, int number2){
        if(number1>number2){
            System.out.println("The largest number is "+number1);
        }else{
            System.out.println("The largest number is "+number2);
        }
    }
    void number(int number1){
        if(number1%2==0){
            System.out.println(number1+" number is even");
        }else{
            System.out.println(number1+" number is odd");
        }
    }
    void palindrome(String noon){


    }
}
