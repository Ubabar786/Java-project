package class16;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private char gender;
    private String hairC;

    public Cat(String name, String breed, int age, double weight, char gender, String hairC) {
        //Reassigning values to instance for local variables
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.hairC = hairC;
    }
    public void printInfo() {

        System.out.println(this.name + " " + breed + " " + age + " " + weight+" "+gender+" "+hairC);
    }
}
