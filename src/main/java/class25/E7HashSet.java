package class25;

import java.util.HashSet;

public class E7HashSet {
    public static void main(String[] args) {

        HashSet<String> fruit = new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Banana");
        System.out.println(fruit);

        fruit.forEach(x-> System.out.println(x));
        System.out.println("********");
        for(String f:fruit){
            System.out.println(f);
        }

    }
}
