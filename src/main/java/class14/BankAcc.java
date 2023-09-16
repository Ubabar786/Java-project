package class14;

public class BankAcc {
    private String name = "Fahim";
    private String userName = "Fahim123";
    private String passWord = "pass123";
    private double accBalance = 300;
    String accNumber = "12345";

    private void printInfo() {
        System.out.println("I am Fahim from batch 17");
    }
    void printCity(){
    System.out.println("New York");
}
    public static void main(String[] args) {
        BankAcc bankAccount = new BankAcc();
        System.out.println(bankAccount.name);
        System.out.println(bankAccount.accNumber);
    }
}