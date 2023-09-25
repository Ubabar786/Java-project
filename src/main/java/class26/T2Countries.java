package class26;

import java.util.TreeMap;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.
*/
public class T2Countries {
    public static void main(String[] args) {
        TreeMap<String, String> countries=new TreeMap<>();

        countries.put("England", "London");
        countries.put("USA", "New York");
        countries.put("Netherlands", "Amsterdam");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        System.out.println(countries);

       // countries.forEach((k,v)->System.out.print("Keys: "+k+" "));
      //  System.out.println();
      //  countries.forEach((k,v)->System.out.print("Values: "+v+" "));

        countries.forEach((k,v)->   {
            if(k.length()>5&&v.contains("a")){
                System.out.println("5 Letters: "+k+" "+v);
            }
        });
    }
}
