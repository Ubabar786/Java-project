package class17;
public class AnimalTester {
    public static void main(String[] args) {

        Cat cat1=new Cat();
        cat1.name="Julie";
        cat1.breed="Russian";
        cat1.colour="White";
        cat1.age=12;
        cat1.printInfo();
        cat1.meow();

        Dog dog1=new Dog();
        dog1.name="Rocky";
        dog1.breed="Rottweiler";
        dog1.colour="Black & Brown";
        dog1.age=7;
        dog1.printInfo();
        dog1.bark();

        Animal a=new Animal();
        a.name="Jimmy";
        a.breed="Stallion";
        a.colour="Yellow";
        a.age=21;
        a.printInfo();
    }
}
