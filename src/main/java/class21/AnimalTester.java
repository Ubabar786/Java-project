package class21;

public class AnimalTester {
    public static void main(String[] args) {

        Animal[] arr={new Dog()};
        for(Animal a:arr){
            a.speak();
            a.eat();
            a.sleep();
        }
        Dog a=new Dog();
        a.printInfo();
    }
}
