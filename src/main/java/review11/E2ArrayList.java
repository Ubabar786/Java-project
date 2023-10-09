package review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        //What is dataType of numbers? Arrays of int
        int[] numbers = new int[10];
        ArrayList<Integer> numbs = new ArrayList<>(10000);
        //What is dataType of numbs? Array of Integers

        numbs.add(10);
        numbs.add(15);
        numbs.add(20);
        numbs.add(25);
        numbs.add(30);
        //To show all of the values^
        System.out.println(numbs);

        numbs.remove(2);
        System.out.println(numbs);

        numbs.remove(new Integer(25));
        System.out.println(numbs);
    }
}
