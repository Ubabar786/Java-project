package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList<String>();
        arr.add("Ace");
        arr.add("Habib");
        System.out.println(arr.get(0));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("Ace"));
        System.out.println(arr.indexOf("Habib"));
    }
}
