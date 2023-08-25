package class6;

public class T11DoWhileLoop {
    public static void main(String[] args) {

        int i = 99;

        do {
            System.out.print(i + " ");
            i -= 2;
        } while (i >= 1);

        System.out.println();

        for (int j = 99; j >= 1; j -= 2) {
            System.out.print(j + " ");

        }
    }
}
