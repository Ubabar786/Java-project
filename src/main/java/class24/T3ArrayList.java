package class24;

import java.util.ArrayList;
//Create an arrayList of drinks call it. If any drink has letter “a”
//        or “e” replace the whole word with water.
public class T3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList();
        drinks.add("Coca Cola");
        drinks.add("Pepsi");
        drinks.add("7-Up");
        drinks.add("Sprite");
        drinks.add("Milk");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {

            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
              drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}
