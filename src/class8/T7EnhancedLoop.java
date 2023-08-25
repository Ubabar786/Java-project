package class8;

public class T7EnhancedLoop {
    public static void main(String[] args) {

        int[] numbs = {10, 77, 25, 56, 60, 20, -10, -5};

            for (int i = 0; i < numbs.length; i++) {
                if (numbs[i] < 10) {
                    numbs[i] = 0;
                }
                System.out.println(numbs[i]);
            }
        }
    }