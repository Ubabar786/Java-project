package class11;

public class T3StringMethods {
    public static void main(String[] args) {
        String str="Hi There, how are you@#@%. I am Good. How are you?";
        System.out.println(str.replaceAll("[@#@%]","?"));
    }
}
