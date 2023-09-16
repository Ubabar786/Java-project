package review8;

public class E2InstanceVariables {
    String name="jam";

    void printName(){
        //instance variable can be accessed
        System.out.println(name);
    }
    static void printInfo(){
        //instance variables cannot be used in static method
       // System.out.println(name);
    }
}
