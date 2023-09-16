package review3;

public class E2LogicalOperators {
    public static void main(String[] args) {

        boolean isMeat=true;
        boolean isEggs=true;
        boolean isFish=true;

        boolean isProtein=isEggs||isMeat||isFish;

        System.out.println(isProtein);
    }
}
