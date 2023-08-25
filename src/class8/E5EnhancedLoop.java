package class8;

public class E5EnhancedLoop {
    public static void main(String[] args) {

        int[] numbs = {10, 77, 25, 56, 60, 20};

        for (int i = 0; i < numbs.length; i++) {
                if(numbs[i]>20){
                    numbs[i]=0;
                }
            System.out.println(numbs[i]);
            }
        }
    }
