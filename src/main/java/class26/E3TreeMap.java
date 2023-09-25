package class26;

import java.util.Collection;
import java.util.TreeMap;

public class E3TreeMap {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup=new TreeMap<>();
        makeup.put("Lipstick", 22.0);
        makeup.put("Blusher", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 95.0);
        makeup.put("Eyeliner", 27.0);
        makeup.put("Concealer", 35.5);
        makeup.put("Eyeliner", 20.0);
        System.out.println(makeup);

        Collection<String> onlyKeys=makeup.keySet();
        Collection<Double> onlyValue=makeup.values();
        System.out.println(onlyKeys);
        System.out.println(onlyValue);

    }
}
