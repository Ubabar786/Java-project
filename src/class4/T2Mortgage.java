package class4;
/*create a java program store values of mortgage rate and mortgage price.
first, program should check if rate is higher than 4.5 user will not buy a house,
otherwise user will consider buying.
Once user decides to buy a house, if price of the house is larger than 5000 than user will take a loan,
otherwise user will pay cash.

 */

public class T2Mortgage {
    public static void main(String[] args) {

        double rate = 4.2;
        double price = 40000;

        if (rate > 4.5) {
            System.out.println("User will not buy a house");

        } else {
            System.out.println("Will consider buying");

            if (price > 50000) {
                System.out.println("Take a loan");

            } else {
                System.out.println("Pay in cash");
            }
        }
    }
}
