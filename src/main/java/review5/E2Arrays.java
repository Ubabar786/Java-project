package review5;

public class E2Arrays {
    public static void main(String[] args) {

        // enhanced for loop
        double[] price = {1.99, 12.09, 1, 4.50};
        //               [0],  [1], [2], [3]

        for (double variableName : price) {
            System.out.println(variableName);
        }
        // regular for loop
        for (int i = 0; i < price.length; i++) {
            System.out.print(price[i] + " ");

        }
    }
}
