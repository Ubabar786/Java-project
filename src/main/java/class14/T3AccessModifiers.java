package class14;

public class T3AccessModifiers {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String str1 = "Uzair";

        String reversed = reverseStr(str1);
        System.out.println(str1);
        System.out.print(reversed + " ");
    }

    public static String reverseStr(String inputStr) {
        String reversed = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversed = reversed + inputStr.charAt(i);
        }
        return reversed;
    }
}




