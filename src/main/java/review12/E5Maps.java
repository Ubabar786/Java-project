package review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class E5Maps {
    public static void main(String[] args) {
        Map<String, Double> studentMarksMap = new HashMap<>();
        studentMarksMap.put("Habib", 95.2);
        studentMarksMap.put("Madina", 89.2);
        studentMarksMap.put("Artur", 93.2);
        studentMarksMap.put("Nelson", 99.2);
        System.out.println(studentMarksMap);

        Set<Map.Entry<String, Double>> entrySet = studentMarksMap.entrySet();
       // var entrySet=studentMarksMap.entrySet();
        // set of entries if you want to remove entries from the set
        entrySet.removeIf(x->{
            if(x.getKey().contains("e") || x.getValue()<90){
                return true;
            }else{
                return false;
            }
        });
        System.out.println(studentMarksMap);

    }
}
