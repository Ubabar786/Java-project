package class24;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numb=new ArrayList();
        numb.add(10);
        numb.add(15);
        numb.add(20);
        numb.add(25);
        numb.add(30);
        System.out.println(numb);

        int sum=0;
       for(Integer n: numb) {
           if(n>20) {
               sum += n; //this is a shorthand opp of => sum=sum+n
           }
        }
        System.out.println("Sum of all elements: "+sum);
    }
}
