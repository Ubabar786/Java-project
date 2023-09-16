package class11;

public class T2StringMethods {
    // Create a string and print it in reverse order
    public static void main(String[] args) {

        String str = "Sunday";
        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));
        }
    }
}
