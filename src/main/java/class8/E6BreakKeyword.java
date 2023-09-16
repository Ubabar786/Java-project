package class8;

public class E6BreakKeyword {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};


        for (int k : nums) {
            if (k == 10) {
                System.out.println(k+ " found");
                break;

            }
        }
    }
}