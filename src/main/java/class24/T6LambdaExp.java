package class24;

import java.util.ArrayList;
//Create an arrayList of even numbers from 1 to 500 using a loop.
//Then write another loop to remove any number that is divisible by 5 from that arrayList.
public class T6LambdaExp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList();

        for (int i = 2; i <= 500; i+=2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println();
//        for (int i = 0; i < numbers.size(); i++) {
//            if(numbers.get(i)%5==0){
//                numbers.remove(i);
//            }
//        }
        numbers.removeIf(x->x%5==0);
        System.out.println(numbers);
    }
}
