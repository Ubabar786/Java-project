package review3;

public class E1LogicalOperators {
    public static void main(String[] args) {
        boolean cond=false;
        System.out.println(!cond);
        //The value is now true because of the (!)

        boolean flag=true;
        boolean box=!flag;
        System.out.println(box);
        //this will be false because the flag variable did not get updated.

    }
}
