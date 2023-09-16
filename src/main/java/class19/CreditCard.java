package class19;

public class CreditCard {

    public void calInterest(double balance) {
        System.out.println(balance * 0.05);
    }
}
class Visa extends CreditCard {

}
class Ax extends CreditCard {
    @Override
    public void calInterest(double balance) {
        System.out.println(balance * 0.07);
    }
}