package JavaProject1;

public class T8MaxAndMin {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?
        int[][] numbers = {
                {24, 96, 33, 15, 7},
                {55, 3, 12, 99, 43},
                {32, 71, 69, 81, 13}
        };

        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int[] a : numbers) {
            for (int i : a) {
                if (i > max) {
                    max = i;
                }
                else if (i < min) {
                    min = i;
                }
            }
        }
        System.out.println("The maximum number is " + max + " and the minimum number is " + min);
    }
}
