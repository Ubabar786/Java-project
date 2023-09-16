package class18;

public class GrandParent {
    public GrandParent(){
        System.out.println("Grandpa");
    }
}
class Parent extends GrandParent{
    public Parent(){
        System.out.println("Daddy");
    }
}
class Children extends Parent{
    Children(){
        System.out.println("Baby");
    }
}
class Tester{
    public static void main(String[] args) {

        Children c=new Children();
    }
}
