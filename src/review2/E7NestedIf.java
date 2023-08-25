package review2;

public class E7NestedIf {
    public static void main(String[] args) {

        String day = "Saturday";
        double accBalance = 5000;
        //With primitive data types we can use > < == != etc
        //Non primitive we use the (.equals) method
        // == equals()   != !equals()
        if (day.equals("Sunday")) {

            if (accBalance > 2000) {
                System.out.println("We can buy this");
            } else {
                System.out.println("It's too expensive");
            }

        }else if(day.equals("Saturday"))   {
            System.out.println("It's Saturday, let's go for dinner");



        } else {
            System.out.println("Let's wait for Sunday");
        }
    }
}