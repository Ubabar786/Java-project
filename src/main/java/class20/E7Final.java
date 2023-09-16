package class20;

public class E7Final {
    public static void main(String[] args) {
        final int AGE=10;
       // AGE=20; unable to change value after 'final' keyword
        System.out.println(AGE);
    }
}
 class Parent{
    void marry(){
        System.out.println("Tak our permission first");
    }
}
class Child extends Parent{
    @Override
    final void marry(){
        System.out.println("I want to marry someone else");
    }
}