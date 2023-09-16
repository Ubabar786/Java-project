package class18;

public class Car {
    private String make;
    private String model;
    private double price;
    private String colour;

    public Car(String make, String model, double price, String colour){
        this.make=make;
        this.model=model;
        this.price=price;
        this.colour=colour;
    }
    public Car(){

    }
    void printInfo(){
        System.out.println(make+" "+model+" "+price+" "+colour);
    }
}
class BMW extends Car{
public BMW(String make, String model, double price, String colour){
    // Calling the constructor from parent class
    super(make, model, price, colour);
// Initialise the instance fields from the parent class
}
}
class Audi extends Car{
    boolean sunRoof;
    public Audi(String make, String model, double price, String colour, boolean sunRoof){
        super(make, model, price, colour);
        this.sunRoof=sunRoof;
    }
}
