package class8;

public class T5EnhancedLoop {
    public static void main(String[] args) {

        int[] numbs = {10, 77, 25, 56, 60, 20};
        int largestEven = numbs[0];

        for (int s : numbs) {

            if (s > largestEven&&s%2==0) {
                largestEven = s;


            }
        }
        System.out.println(largestEven);
    }
}