package review8;

public class E3StaticVariables {
    public static String country="USA";
    void printName(){
        System.out.println(country);
    }
    static void printCountry(){
        System.out.println(country);
    }
    public static void main(String[] args) {
        System.out.println(country);
    }
}
class StaticTester{
    public static void main(String[] args) {
        System.out.println(E3StaticVariables.country);
    }
}
