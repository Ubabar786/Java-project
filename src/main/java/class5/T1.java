package class5;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter your birth month");

        String birthMonth=scanner.next();

        if(birthMonth.equalsIgnoreCase("Mar")||birthMonth.equalsIgnoreCase("Apr")||birthMonth.equalsIgnoreCase("May"))   {
            System.out.println("Spring");

    } else if (birthMonth.equalsIgnoreCase("Jun")||birthMonth.equalsIgnoreCase("Jul")||birthMonth.equalsIgnoreCase("Aug")) {
            System.out.println("Summer");
        }
    }
}
