package class3;

public class E10ElseIf {
    public static void main(String[] args) {
        //String is a non-primitive data type
        String fruit="Kiwi";

        if (fruit.equals("Mango")) { //Primitive data types fruit=="Mango" and non primitive is fruit.equals(Orange)
            System.out.println("Price is £5");

        } else if (fruit.equals("Orange")) {
            System.out.println("Price is £4");

        } else if (fruit.equals("Apple")) {
            System.out.println("Price is £3");

        } else if (fruit.equals("Banana")) {
            System.out.println("Price is £10");

    }else {
            System.out.println("This fruit is not available right now");
        }

    }
}
