package class23;

public class BankAcc {
    private String name;
    final private long bankAccNum;
    private double balance;
    final private String userName;
    private String passWord;
    final private String accType;

    public BankAcc(String name, long bankAccNum, double balance,
                   String userName, String passWord, String accType) {
        this.name = name;
        this.bankAccNum = bankAccNum;
        this.balance = balance;
        this.userName = userName;
        this.passWord = passWord;
        this.accType = accType;
    }

    public BankAcc(long bankAccNum, String userName, String passWord, String accType) {
        this.bankAccNum = bankAccNum;
        this.userName = userName;
        this.passWord = passWord;
        this.accType = accType;
    }

    public BankAcc(String userName, String accType, long bankAccNum) {
        this.bankAccNum = bankAccNum;
        this.userName = userName;
        this.accType = accType;
    }

    public String getName() {
        return name;
    }

    public long getBankAccNum() {
        return bankAccNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccType() {
        return accType;
    }
}
