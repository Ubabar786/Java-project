package class25;

import java.util.LinkedList;

public class E4ArrayListVsLinkedList {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers=new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            numbers.add(0,i);
//        } Wrong method to execute this code as it takes a long time
        long startingTime=System.currentTimeMillis();
//        System.out.println(startingTime);
        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);
    }
}
