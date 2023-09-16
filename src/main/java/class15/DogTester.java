package class15;

public class DogTester {
    public static void main(String[] args) {
        Dog d1=new Dog("Jack", "German", "Pink", 25);
        d1.printInfo();
        Dog d2=new Dog("Tommy", "Pitbull", "Brown", 15);
        d2.printInfo();

        Dog d3=new Dog("Bobby", "Labrador", "Black");
        d3.printInfo();

        String name="Alina";
        int size=name.length();

      /*  d1.name="Jack";
        d1.breed="German";
        d1.colour="Pink";
        d1.age=25;
        d1.printInfo();
        d1.bark(); */

// Initialising the object from the class that has values in the instance field.

     /*   Dog d2=new Dog();
        d2.name="Tommy";
        d2.breed="Pitbull";
        d2.colour="Brown";
        d2.age=15;
        d2.printInfo();
        d2.bark(); */


    }
}
