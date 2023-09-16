package class16;

public class Person {
    //Instance variables
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairC;

    //parameter name should be different from instance variable but can be the same
    public Person(String name, int age, double weight, char gender) {
        //Reassigning values to instance for local variables
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;

    }  //more constructors gives more options to the user
    public Person(String name, int age, double weight, char gender, int salary, String hairC) {
       /* this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;*/

        this(name, age, weight, gender);
        this.salary = salary;
        this.hairC = hairC;
    }
        public void printInfo() {
            String name = "Giu";
            //explicit 'this' to instance variables
            System.out.println(this.name + " " + age + " " + weight + " " + gender);

    }
}