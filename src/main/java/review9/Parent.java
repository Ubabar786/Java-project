package review9;

public class Parent {
    String name = "James";

    void printHello() {
        System.out.println("Hello World");
    }

    public Parent() {
        System.out.println("Parent class is constructor");
    }
}
class Child extends Parent{
    String name="John";
    void printHello(){
        System.out.println("Hello Java");
    }
    void test(){
        String name="White";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
    void methodTest(){
        super.printHello();
        this.printHello();
    }
    public Child(){
    }
}

