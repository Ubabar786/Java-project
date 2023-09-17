package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {

        Integer number=new Integer(10);
        // int=>Integer is called Boxing.
        // primitive => class/object type is called Boxing.

        Integer number2=10; // AutoBoxing

        int d=number2.intValue();
        // Integer=>int is called UnBoxing.
        //converting from class type to primitive

        int f=d; //AutoUnBoxing

        System.out.println(f);

    }
}
