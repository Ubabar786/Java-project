package JavaProject1;

public class T92ndLargest {
    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array?
        int[] numbers = {100, 66, 13, 49, 82};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];

            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }
}
