package class21;

public abstract class Animal {
    String name;
    String breed;
    String colour;

    abstract void speak();

    abstract void sleep();

    abstract void eat();

    public void printInfo(){
        System.out.println(name+" "+breed+" "+colour);
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof woof..");
    }

    @Override
    void sleep() {
        System.out.println("Zzzzzzz");
    }

    @Override
    void eat() {
        System.out.println("Munch munch..");

    }
}

