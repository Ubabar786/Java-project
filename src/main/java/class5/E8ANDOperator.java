package class5;

public class E8ANDOperator {
    public static void main(String[] args) {

        boolean goodCredit=true;
        boolean stableJob=true;
        boolean minAge=true;

        if(goodCredit&&stableJob&&minAge)   {
            System.out.println("You can have the loan");
        }else   {
            System.out.println("You need to fulfil all the requirement");
        }
    }
}
