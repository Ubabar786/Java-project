package JavaProject1;

public class T3OddAndEven {
    public static void main(String[] args) {
         /*
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] array = {
                {58, 21, 57, 76, 14},
                {36, 45, 13, 11, 90}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
