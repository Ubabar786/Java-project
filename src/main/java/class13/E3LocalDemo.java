package class13;
// instance variables - int sum=0;
public class E3LocalDemo {

    void addElements() {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
