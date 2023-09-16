package review9;

public class CalTester {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(10,10);

        int result=c.add(10,10,10);
        System.out.println(result);
    }
}
