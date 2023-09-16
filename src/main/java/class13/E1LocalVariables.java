package class13;

public class E1LocalVariables {
    String country="USA";
    public static void main(String[] args) {
        String name = "Java";

        if (10 > 5) {
            int age = 23;

        }

       // System.out.println(age); //only accessed within block of code
        System.out.println(name);
    }
}
