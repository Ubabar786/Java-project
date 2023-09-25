package JavaProject2;

import java.util.ArrayList;

public class T7StartsWithA {
    /*
You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
*/
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList();
        words.add("Banana");
        words.add("Apple");
        words.add("Peach");
        words.add("Apricot");
        words.add("Cherry");
        words.add("Avocado");

        for (String str : words) {
            if (str.startsWith("A") || str.startsWith("a")) {
                System.out.println(str.toLowerCase());
            }
        }
    }
}
