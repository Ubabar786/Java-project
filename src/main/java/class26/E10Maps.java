package class26;

import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup=new TreeMap<>();
        makeup.put("Lipstick", 22.0);
        makeup.put("Blusher", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 95.0);
        makeup.put("Eyeliner", 27.0);
        makeup.put("Concealer", 35.5);
        makeup.put("Eyeliner", 20.0);

//        Set<Map.Entry<String,Double>> entries=makeup.entrySet();
//        for(Map.Entry<String,Double> e:entries){
//            System.out.println(e.getKey()+""+e.getValue());
//        }
        var entries=makeup.entrySet();
        for(var e:entries)   {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
