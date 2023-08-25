package class10;

public class DogTester {
    // Creating an obj from the Dog class
    public static void main(String[]   args){
        Dog lunasObj= new Dog();
        // Assigning a value to name using lunasObj
        lunasObj.name="Luna";
        lunasObj.gender='F';
        lunasObj.breed="Shiba";
        lunasObj.weight=10;
        lunasObj.age=20;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);
        // We are calling the bark method on lunasObj

        lunasObj.bark();
        lunasObj.eat();
        lunasObj.sleep();
    }
}
