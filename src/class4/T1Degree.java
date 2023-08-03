package class4;

public class T1Degree {

    public static void main(String[] args) {
        boolean diploma = true;
        double gpa = 3.5;

        if (diploma == true) {
            System.out.println("Congratulations");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");

            } else {
                System.out.println("You should have studied harder");
            }

        }else {
            System.out.println("Get a degree");
        }
    }
}