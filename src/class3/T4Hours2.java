package class3;
//Create a Java program that stores the expected temperature and the actual temperature for a day.
// If the expected temperature is higher than the actual temperature,
// print "It's cooler than expected, wear a jacket!",
// otherwise print "It's as warm as expected, enjoy your day!"
public class T4Hours2 {
    public static void main(String[] args) {
        double expectedTemp= 42.2;
        double actualTemp= 38.9;

        if (expectedTemp>actualTemp) {
            System.out.println("It's cooler than expected, wear a jacket");
        }else {
            System.out.println("It's as warm as expected, enjoy your day!");
        }

    }
}
