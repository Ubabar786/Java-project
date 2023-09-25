package class25;

import java.util.LinkedList;

public class E3ArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.removeIf(x->x>15);
        System.out.println(numbers);

    }
}
