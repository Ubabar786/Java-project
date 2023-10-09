package class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E2ListOfMaps {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        String name = "Dulma";
        names.add(name);

        String n = names.get(0);
        System.out.println(n);
        List<Map<String, String>> mapList = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("Name", "Ehab");
        map.put("City", "MaryLand");
        map.put("Age", "150");
        map.put("Salary", "1500000");

        mapList.add(map);

        Map<String, String> map1 = new HashMap<>();
        map1.put("Name", "Fahim");
        map1.put("City", "California");
        map1.put("Age", "200+");
        map1.put("Salary", "2000000");
        mapList.add(map1);

        Map<String, String> firstMap = mapList.get(0);
        System.out.println(firstMap.get("Name"));


    }
}
