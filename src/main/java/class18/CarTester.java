package class18;

public class CarTester {
    public static void main(String[] args) {

        BMW i8=new BMW("BMW", "i8", 50000, "Black");

        i8.printInfo();

        Audi a=new Audi("Audi", "RS6", 80000, "White", true);
        a.printInfo();
    }
}
