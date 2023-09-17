package class24;

import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList();
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("BMW");
        System.out.println(cars);
        System.out.println("**********************");
        for (String c : cars) {
            System.out.println(c);
        }
    }
}
