package class24;

import java.util.ArrayList;

public class T5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList();
        word.add("milk");
        word.add("banana");
        word.add("coffee");
        word.add("table");
        word.add("TV");
        System.out.println(word);


// Lambda expression below..

//        word.removeIf((String x)->{
//            if(x.endsWith("e")){
//                return true;
//            }else{
//                return false;
//            }
//        });

        word.removeIf(x->x.endsWith("e"));

        System.out.println(word);
    }
}
