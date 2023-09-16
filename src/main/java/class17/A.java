package class17;

public class A {
    String name;
    void printName(){
        System.out.println(name);
    }
}
class B extends A{
    String colour;

    void printColour(){
        System.out.println(colour);
    }
}
class C extends B{
    void printNameColour(){
        System.out.println(name+" "+colour);
    }
}
class D extends B{

}