package review11;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Cherry");
        fruit.add("Apple");

        //fruit.clear();
        //System.out.println(fruit);

        //fruit.forEach(x-> System.out.println(x));

       /* fruit.forEach(x->{
            if (x.contains("a")){
                System.out.println(x);
            }
        });
        System.out.println(fruit); */

        fruit.set(2, "Grapes"); //its going to replace elements at index 2
        System.out.println(fruit);

        fruit.isEmpty();

        System.out.println(fruit.indexOf("Apple"));
        System.out.println(fruit.lastIndexOf("Apple"));




    }
}
