package class7;

public class T3NestedLoops {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 4) {

            int j = 1;
            while (j <= 6) {
                if (j != 3) {
                    System.out.print(j + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
