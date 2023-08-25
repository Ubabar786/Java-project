package class7;

public class T11Arrays {
    public static void main(String[] args) {

        int [] prices= new int[5];
        prices[0]=20;
        prices[1]=10;
        prices[2]=50;
        prices[3]=30;
        prices[4]=40;
        int sum=0;
        for (int i = 0; i < prices.length; i++) {
            sum=sum+prices[i];

        }
        System.out.println(sum);

        }
    }
