package class24;

import java.util.ArrayList;

public class T4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList();
        words.add("Because");
        words.add("You");
        words.add("Are");
        words.add("Cool");
        words.add("Java");
        words.add("Table");
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).endsWith("e")) {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
        System.out.println("*****************************************");

        ArrayList<String> word = new ArrayList();
        word.add("milk");
        word.add("banana");
        word.add("coffee");
        word.add("table");
        word.add("TV");
        System.out.println(word);

        //reverse for loop is better concept
        for (int i = word.size() - 1; i >= 0; i--) {
            String w = word.get(i);
            if (word.get(i).endsWith("e")) {
                word.remove(i);
            }
        }
        System.out.println(word);

    }
}
