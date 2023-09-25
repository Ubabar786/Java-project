package class25;

import java.util.LinkedHashSet;

public class E8LinkedHashSets {
    public static void main(String[] args) {

        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>();
        //No duplicates but maintained the order
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);
        uniqueNumbers.add(30);
        uniqueNumbers.add(10);
        System.out.println(uniqueNumbers);

    }
}
