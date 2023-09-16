package class18;

public class Furniture {
    String colour="Black";
}
class Chair extends Furniture{
    String colour="Brown";
    void printColour(){
       String colour="Blue";
        System.out.println(colour);
        System.out.println(this.colour);
        System.out.println(super.colour);
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair c=new Chair();
        c.printColour();
    }
}