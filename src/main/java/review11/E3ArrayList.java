package review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Ali"); //0
        names.add("Jamel"); //1
        names.add("Rai"); //2
        names.add("Aya"); //3
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.remove(0));
        System.out.println(names.remove("Jamel"));
        System.out.println(names.contains("Aya")); //true
        System.out.println(names.contains("Jamila")); //false

        names.removeIf(x->x.equals("Aya"));
        System.out.println(names);
    }
}
