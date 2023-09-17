package class24;

import java.util.ArrayList;
//create an arrayList of fruit then remove all the
// fruit which contains the letter a or ends with the letter e
public class T7LambdaExp {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("peach");
        fruit.add("kiwi");
        fruit.add("cherry");

        fruit.forEach(x-> System.out.print(x+" "));
        System.out.println();
        fruit.removeIf(x->x.contains("a") || x.endsWith("e"));
        System.out.println(fruit);
    }
}
