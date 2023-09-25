package class26;

import java.util.LinkedHashMap;

public class E2LinkedHashMaps {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students=new LinkedHashMap<>();
        students.put(1, "Ehab");
        students.put(2, "Adam");
        students.put(3, "Marta");
        students.put(4, "Ahmed");
        students.put(5, "Ehab");
        System.out.println(students);
        students.remove(2);
        System.out.println(students);
        students.replace(3, "Jamel");
        System.out.println(students);


    }
}
