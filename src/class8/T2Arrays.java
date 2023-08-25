package class8;

public class T2Arrays {
    public static void main(String[] args) {
//Count how many values are present in array
        int[] numbs = {10, 20, 4, 3, 8, 45, 96};
        int count = 0;
        for (int i = 0; i < numbs.length; i++) {

            if (numbs[i]>10) {
                count++;

            }
        }
        System.out.println(count);
    }
}
