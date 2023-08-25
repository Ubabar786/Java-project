package class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your country");

        String country=scanner.nextLine();

        switch (country)   {
            case "England":
                System.out.println("English");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "Saudi Arabia":
                System.out.println("Arabic");
                break;
            case "China":
                System.out.println("Chinese");
                break;
            case "Pakistan":
                System.out.println("Urdu");
                break;
            case "Congo":
                System.out.println("Congolese");
                break;
            default:
                System.out.println("No country");

        }




    }
}
