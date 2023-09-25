package JavaProject2;

public class T3Palindrome {
    /*
    Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome
    */
    public static void main(String[] args) {
        String input = "madam";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
