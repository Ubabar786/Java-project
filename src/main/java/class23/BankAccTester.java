package class23;

public class BankAccTester {
    public static void main(String[] args) {
        BankAcc b = new BankAcc("Uzair", 1234554321, 16000000,
                "user123", "pass123", "Checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccNum());
        b.setName("Shawn");
        System.out.println(b.getName());
    }
}
