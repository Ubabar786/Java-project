package class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        ArrayList<Double> pricesOfMakeUp=new ArrayList<>();
        pricesOfMakeUp.add(25.5);
        pricesOfMakeUp.add(30.2);
        pricesOfMakeUp.add(25.2);

        ArrayList<Double> pricesOfFruit=new ArrayList<>();
        pricesOfFruit.add(2.5);
        pricesOfFruit.add(3.99);
        pricesOfFruit.add(4.99);

        ArrayList<Double> pricesOfDairy=new ArrayList<>();
        pricesOfDairy.add(1.99);
        pricesOfDairy.add(2.99);
        pricesOfDairy.add(3.99);
        pricesOfDairy.add(4.99);

        Map<String, ArrayList<Double>> arrListMap=new HashMap<>();
        arrListMap.put("pricesOfMakeUp", pricesOfMakeUp);
        arrListMap.put("pricesOfFruit", pricesOfFruit);
        arrListMap.put("pricesOfDairy", pricesOfDairy);
        System.out.println(arrListMap);


    }
}
