package class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {

        int[] numbs = {10, 77, 25, 56, 60, 20, -10, -5};
        int smallestNumb = numbs[0];

        for (int s : numbs) {

            if (s < smallestNumb) {
                smallestNumb = s;


            }
        }
        System.out.println(smallestNumb);
    }
}