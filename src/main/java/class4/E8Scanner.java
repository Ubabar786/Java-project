package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name = scanner.next();

        if (name.equals("Jamal")) {
            System.out.println("I live in Canada");

        } else if (name.equals("Ayesha")) {
            System.out.println("Senior SDET");
        } else if (name.equals("Habib")) {
            System.out.println("jailed by wife");
        } else if (name.equals("Kiran")) {
            System.out.println("I love java");
        } else if (name.equals("Amber")) {
            System.out.println("I like java");
        } else if (name.equals("Laura")) {
            System.out.println("Stop with the dad jokes");

        }else {
            System.out.println("Try again");
        }
    }
    }
