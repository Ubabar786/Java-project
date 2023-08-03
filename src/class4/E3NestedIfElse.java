package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {

        double accBalance = 30000;

        if (accBalance > 20000) {
            System.out.println("We can afford a normal toyota");
            if (accBalance > 50000) {
                System.out.println("We can afford luxury car as well");
            }
        } else {
            System.out.println("We need to save more");
        }
    }
}
