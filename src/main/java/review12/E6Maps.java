package review12;

import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        Map<String, Double> studentMarksMap = new HashMap<>();
        studentMarksMap.put("Habib", 95.2);
        studentMarksMap.put("Madina", 89.2);
        studentMarksMap.put("Artur", 93.2);
        studentMarksMap.put("Nelson", 99.2);
        System.out.println(studentMarksMap);

        studentMarksMap.replaceAll((k,v)->{
            if(k.contains("a")){
                return 10.0;
            }else{
                return v;
            }
        });
        System.out.println(studentMarksMap);
    }
}
