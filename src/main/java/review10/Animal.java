package review10;

public class Animal {
    void speak(){
        System.out.println("Animals speak");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Woof woof...");
    }
    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");

    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meowwww");
    }
    @Override
    void eat() {
        System.out.println("Cats like to eat fish");
    }
}