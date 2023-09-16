package class15;

public class Dog {
   private String name;
   private String breed;
   private  String colour;
   private int age;

  public Dog(String dName, String dBreed, String dColour, int dAge){
       name=dName;
       breed=dBreed;
       colour=dColour;
       age=dAge;
       bark();

       if(dAge<0 || dAge>30){
           System.out.println("Not allowed");
       }else{
           age=dAge;
       }
   }
    public Dog(String dName, String dBreed, String dColour){
        name=dName;
        breed=dBreed;
        colour=dColour;

   }
   public void bark(){
        System.out.println("woof woof...");
    }
   public void printInfo(){
        System.out.println(name+" "+breed+" "+colour+" "+age);
    }
}
