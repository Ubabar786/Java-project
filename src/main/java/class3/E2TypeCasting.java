package class3;

public class E2TypeCasting {
    public static void main(String[] args) {
        //byte->short->int->long->float->double

        float box1=15.05F;

        int box2;
        box2= (int)box1; //type casting narrowing/explicit/manual the space
        System.out.println(box2);
    }
}
