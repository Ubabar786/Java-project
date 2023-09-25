package class26;

import java.util.ArrayList;

public class E7Maps {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        //new ArrayList<>(); => Creating the object of the ArrayList class
        names.add("Avis");
        names.add("Adam");
        names.add("John");
        names.add("James");

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        ArrayList<ArrayList<Integer>> numList=new ArrayList<>();
        numList.add(numbers);
        System.out.println(numList);

        ArrayList<ArrayList<String>> arrLists=new ArrayList<>();
        arrLists.add(names);
        System.out.println(arrLists);
    }
}
