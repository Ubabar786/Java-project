package class26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T3BestBuy {
    public static void main(String[] args) {
        HashMap<Integer,String> items=new HashMap<>();
        items.put(7664847, "Printer");
        items.put(789101, "Keyboard");
        items.put(789432, "Mouse");


        Set<Map.Entry<Integer,String>> i=items.entrySet();
        var entries=items.entrySet();
        for(var e:entries)   {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
