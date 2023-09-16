package class8;

public class T4EnhancedLoop {
    public static void main(String[] args) {

        int[] numbs = {10, 23, 25, 56, 45, 20};

        for (int evenNumber : numbs) {

            if (evenNumber % 2 == 0) {

                System.out.println(evenNumber);
            }
        }
    }
}