package class8;

public class T3EnhancedLoop {
    public static void main(String[] args) {

        int[] numbs = {10, 23, 25, 56, 45, 20};
        int largest = numbs[0];

        for (int t : numbs) {

            if (t > largest){
                largest=t;

        }
    }
    System.out.println(largest);
}
}