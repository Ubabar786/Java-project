package review12;

import java.util.*;

public class E2Sets {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);
        nums.add(20);
        System.out.println(nums);

        //to remove the duplicates from the ArrayList
        Set<Integer> numbs = new LinkedHashSet<>(nums);
        /*System.out.println(numbs);

        //restore back into a new ArrayList
        nums=new ArrayList<>(numbs);
        System.out.println(nums); */

        //clear list because it has duplicates and add unique list from Linkedhashset
        nums.clear();
        nums.addAll(numbs);
        System.out.println(nums);



    }
}
