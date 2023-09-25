package class25;

import java.util.LinkedList;

public class T1CatTester {
    public static void main(String[] args) {
        LinkedList<T1Cat> catList = new LinkedList<>();

        T1Cat cat1 = new T1Cat("Whiskers", 5, "Persian");
        T1Cat cat2 = new T1Cat("Fluffy", 4, "Bengal");
        T1Cat cat3 = new T1Cat("Felix", 3, "Tabby");

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);

//        for (T1Cat c : catList) {  //enhanced for loop
//            c.printInfo();
        catList.forEach(x->x.printInfo()); //Lambda expression
            System.out.println();
        }

}
