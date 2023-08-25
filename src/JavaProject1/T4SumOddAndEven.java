package JavaProject1;

public class T4SumOddAndEven {
    public static void main(String[] args) {
         /*
        Create a 2D array of integers. Develop a program which will
        calculate the sum of even and odd numbers for that array.
         */
        int[][] numbers = {
                {55, 12, 41, 13, 22},
                {11, 31, 22, 15, 69},
                {21, 3, 44, 16, 25}
        };

        int sum = 0;

        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {
                sum = sum + numbers[row][col];
            }
        }
        System.out.println(sum);
    }
}
