package class22;

public interface Vehicle {
    void drive();

}
interface Bike extends Vehicle{
    void applyBrakes();
}
class HondaBike implements Bike{

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void applyBrakes() {
        System.out.println();
    }
}