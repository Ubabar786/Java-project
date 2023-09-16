package class14;

public class T2AccessModifiers {
    public static void main(String[] args) {
        T2AccessModifiers t2 = new T2AccessModifiers();
        int[] array = {10, 15, 25};
        System.out.println(t2.getArrSum(array));
    }
    int getArrSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum = sum + n;
        }
        return sum;
    }
}




