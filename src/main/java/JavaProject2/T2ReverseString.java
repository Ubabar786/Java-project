package JavaProject2;

public class T2ReverseString {
    /*
Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
*/
    public static void main(String[] args) {

        String str = "Hello Asghar";
        String[] arr = str.split("\\s");

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String reversed = reverseStr(word);
            System.out.print(reversed + " ");
        }
    }

    static String reverseStr(String inputStr) {
        String reversed = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversed = reversed + inputStr.charAt(i);
        }
        return reversed;
    }
}
