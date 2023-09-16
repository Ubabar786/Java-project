package class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter = true;
        String jacketColour = "Red";

        if (winter == true) {
            System.out.println("It's very cold");
            if (jacketColour.equals("Red")) {
                System.out.println("Let's go with Red Nike shoes");

            } else  {
                System.out.println("Let's go with the blue ones");
            }
        } else {
            System.out.println("No need to wear jacket");

        }
    }
}