package JavaProject1;

public class T92ndLargest {
    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array?
        int[][] numbers = {
                {100, 66, 13, 49, 82},
                {62, 31, 54, 84, 91},
                {4, 59, 97, 71, 20}
        };

        int largest = numbers[0][1];
        int secondLargest = numbers[0][0];

        for (int[] a : numbers) {
            for (int i : a) {
                if (i > secondLargest) {
                    secondLargest = i;
                }
                if (i > largest) {
                    secondLargest = largest;
                    largest = i;
                }
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }
}
