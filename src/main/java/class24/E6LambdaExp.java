package class24;

import java.util.ArrayList;

public class E6LambdaExp {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList();
        word.add("milk");
        word.add("banana");
        word.add("coffee");
        word.add("table");
        word.add("TV");

//        for(String x:word){
//            System.out.println(x);
//        }
        word.forEach(x-> System.out.println(x));
        word.removeIf(y->y.contains("e"));
        System.out.println(word);

    }
}
