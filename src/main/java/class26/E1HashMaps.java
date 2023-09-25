package class26;

import java.util.HashMap;

public class E1HashMaps {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple", 8.0);
        fruit.put("Banana", 3.0);
        fruit.put("Orange", 5.22);
        fruit.put("Kiwi", 6.5);
        fruit.put("Apple", 4.0);
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue(4.0));
        System.out.println(fruit.isEmpty());






        //auto typecasting
        int a=10;
        double b=a;


    }
}
