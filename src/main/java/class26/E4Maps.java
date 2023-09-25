package class26;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup=new TreeMap<>();
        makeup.put("Lipstick", 22.0);
        makeup.put("Blusher", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 95.0);
        makeup.put("Eyeliner", 27.0);
        makeup.put("Concealer", 35.5);
        makeup.put("Eyeliner", 20.0);
        //Both keys ands values
        //makeup.forEach((k,v)-> System.out.println(k+" "+v));
        //Prints only keys
       // makeup.forEach((k,v)->System.out.println(k));
        //Only values
       // makeup.forEach((k,v)->System.out.println(v));
        //Whenever you need more than one parameter you need to put parentheses
        //Similarly if we want to have more than one line of code we need to have
        //curly brackets as well
        makeup.forEach((k,v)->   {
            if(k.contains("a")){
                System.out.println(v);
            }
        });
    }
}
