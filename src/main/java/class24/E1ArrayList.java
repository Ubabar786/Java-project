package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Uzair");
        names.add("Fahim");
        names.remove(0);
        names.remove("Deepali");
        System.out.println(names);
        names.add("Ehab");
        System.out.println(names);
        names.add(2, "Clare");
        System.out.println(names);
        names.set(3, "Jamel");
        System.out.println(names);


    }
}
