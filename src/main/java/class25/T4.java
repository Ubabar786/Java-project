package class25;

import java.util.LinkedHashSet;

public class T4 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("London");
        cities.add("Alabama");
        cities.add("Istanbul");
        cities.add("Antwerp");
        cities.add("Rome");
        cities.add("Tokyo");
        System.out.println(cities);
        cities.removeIf(x->x.toLowerCase().startsWith("a"));
        System.out.println(cities);
    }
}
