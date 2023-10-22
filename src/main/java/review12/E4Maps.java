package review12;

import java.util.HashMap;
import java.util.Map;

public class E4Maps {
    public static void main(String[] args) {
        Map<String, Double> studentMarksMap = new HashMap<>();
        studentMarksMap.put("Habib", 95.2);
        studentMarksMap.put("Madina", 92.2);
        studentMarksMap.put("Artur", 93.2);
        studentMarksMap.put("Nelson", 99.2);

        System.out.println(studentMarksMap);

        //print all values from map one by one
        studentMarksMap.forEach((k,v)-> System.out.println(k+" "+v));
        final int [] counter=new int[1];
        studentMarksMap.forEach((k,v)->{
            if(k.contains("a") || v > 96){
                System.out.println(k+" "+v);
                counter[1]++;
            }

        });

    }
}
