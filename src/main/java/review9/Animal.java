package review9;

public class Animal {
    void sleep() {
        System.out.println("Animals sleeping");
    }

    void speak() {
        System.out.println("Animals speaking");
    }
}
    class Dog extends Animal{
        @Override
        void speak() {
            System.out.println("Woof woof...");
        }
        @Override
        void sleep(){
            System.out.println("Zzzzzzzzz");
    }
}
