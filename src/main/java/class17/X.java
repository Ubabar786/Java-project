package class17;

public class X {
    String name;
    void printName() {
        System.out.println(name);
    }
}
class Y extends X{
    int age;
    void printAge(){
        System.out.println(age);
    }
}
class Z extends Y{
    void printNameAge(){
        System.out.println(name+" "+age);
    }
}