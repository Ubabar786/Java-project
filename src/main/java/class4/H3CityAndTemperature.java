package class4;

import java.util.Scanner;

public class H3CityAndTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the name of your city");
        String city=scanner.nextLine();

        System.out.println("Please enter your city temperature in Fahrenheit");
        double temp= scanner.nextDouble();

        double convertFToC=((temp-32)*5/9);   //Conversion formula
        System.out.println("The temperature of your city in Celsius is " +convertFToC);
    }
}
