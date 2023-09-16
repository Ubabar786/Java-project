package class15;

public class CarTester {
    public static void main(String[] args) {
        Car c1=new Car("Lambo", "Urus", "Green", 300000);
        c1.printInfo();

        Car c2=new Car("Toyota", "Camry", "Silver", 35000);
        c2.setPrice(30000);
        c2.printInfo();
        System.out.println(c2.getPrice());
    }
}
