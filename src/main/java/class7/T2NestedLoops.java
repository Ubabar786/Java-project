package class7;

public class T2NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j != 3) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
