package class5;

public class T3ANDOROperator {
    public static void main(String[] args) {

        int day=6;

        if(day>=1 && day<=5)   {
            System.out.println("It's a weekday");
        } else if (day ==6 || day ==7) {
            System.out.println("It's a weekend");

        }else   {
            System.out.println("Invalid day");
        }
    }
}
