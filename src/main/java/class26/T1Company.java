package class26;

import java.util.LinkedHashMap;
/*Create a map of a building. Store floor number and its associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor Print your map
 */
public class T1Company {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> companies=new LinkedHashMap<>();

        companies.put(1, "Google");
        companies.put(2, "Syntax");
        companies.put(3, "Microsoft");
        companies.put(4, "Apple");
        companies.put(5, "Samsung");
        companies.put(6, "Lenovo");
        companies.put(7, "Acer");
        System.out.println(companies);
        System.out.println(companies.size());
        companies.replace(4, "Google");
        System.out.println(companies);
        companies.remove(7);
        System.out.println(companies);

    }
}
