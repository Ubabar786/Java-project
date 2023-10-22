package review12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
        Map<String, Double> studentMarksMap = new HashMap<>();
        studentMarksMap.put("Habib", 95.2);
        studentMarksMap.put("Madina", 92.2);
        studentMarksMap.put("Artur", 93.2);
        studentMarksMap.put("Nelson", 99.2);


        LinkedHashMap<String, Double> studentMarksMap1 = new LinkedHashMap<>();
        studentMarksMap1.put("Habib", 95.2);
        studentMarksMap1.put("Madina", 92.2);
        studentMarksMap1.put("Artur", 93.2);
        studentMarksMap1.put("Nelson", 99.2);


        TreeMap<String, Double> studentMarksMap2 = new TreeMap<>();
        studentMarksMap2.put("Habib", 95.2);
        studentMarksMap2.put("Madina", 92.2);
        studentMarksMap2.put("Artur", 93.2);
        studentMarksMap2.put("Nelson", 99.2);
    }
}
