package class25;

import java.util.TreeSet;

public class T3 {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("England");
        countries.add("Brazil");
        countries.add("Argentina");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Peru");
        countries.add("Pakistan");
        countries.add("Germany");
        countries.add("Poland");
        countries.add("Turkey");
        System.out.println(countries);
        System.out.println();
        for(String c:countries){
            System.out.println(c);
        }
        System.out.println();
        countries.forEach(x-> System.out.println(x));
    }
}
