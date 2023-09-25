package class25;

public class T1Cat {
  private  String name;
   private int age;
   private String breed;

    public T1Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);

    }
}
