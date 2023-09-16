package review7;

public class Superheroes {
    String name, power;
    int age;
    char gender;

    Superheroes(String name, String power){
        this.name=name;
        this.power=power;
        System.out.println(name+power);
    }
    Superheroes(String name, String power, int age){
        this(name, power); //making a call to the CURRENT class constructor
        this.age=age; //this. -> accessing CURRENT class instance variable
    }
    Superheroes(String name, String power, int age, char gender){
        this(name, power, age);
        this.gender=gender;
    }

    public static void main(String[] args) {

        Superheroes hero1=new Superheroes("Superman", "Fly");
        Superheroes hero2=new Superheroes("Batman", "Money", 27);
        Superheroes hero3=new Superheroes("Thor", "Powerful", 35, 'M');

    }
}
