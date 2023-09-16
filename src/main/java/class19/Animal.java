package class19;

public class Animal {
    private String name;
    private String colour;
    private int age;
    int num=10;

    public Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }
    public void printInfo(){
       System.out.println(name+" "+colour+" "+age);
   }
}
class Dog extends Animal {
    int num = 20;
    double weight;

    public Dog(String name, String colour, int age, double weight) {
        super(name, colour, age);
        this.weight = weight;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println(weight);
    }
}

    /* overriding printInfo method below
    public void printInfo(){
        System.out.println("My own method"); */

