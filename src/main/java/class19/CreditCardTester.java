package class19;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard cc = new CreditCard();
        cc.calInterest(100);

        Visa vv=new Visa();
        vv.calInterest(100);

        Ax aa=new Ax();
        aa.calInterest(100);
    }
}
