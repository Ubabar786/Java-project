package JavaProject2;

public class T11Car {
    /*
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount.
*/
    private double carPrice;
    private String carColour;

    public T11Car(double carPrice, String carColour) {
        this.carPrice = carPrice;
        this.carColour = carColour;
    }

    double calcSalePrice() {
        return carPrice;
    }
}

class Truck extends T11Car {
    private double weight;

    public Truck(double carPrice, String carColour, double weight) {
        super(carPrice, carColour);
        this.weight = weight;
    }

    @Override
    double calcSalePrice() {
        if (weight > 2000) {
            return super.calcSalePrice() * 0.10;
        } else {
            return super.calcSalePrice() * 0.20;
        }
    }
}

class Sedan extends T11Car {
    private int length;

    public Sedan(double carPrice, String carColour, int length) {
        super(carPrice, carColour);
        this.length = length;
    }

    @Override
    double calcSalePrice() {
        if (length > 20) {
            return super.calcSalePrice() * 0.05;
        } else {
            return super.calcSalePrice() * 0.10;
        }
    }
}

class Tester {
    public static void main(String[] args) {
        Truck t = new Truck(75000, "Blue", 5000);
        System.out.println("Truck sale price: £" + t.calcSalePrice());

        Sedan s = new Sedan(60000, "Red", 22);
        System.out.println("Sedan sale price: £" + s.calcSalePrice());
    }
}