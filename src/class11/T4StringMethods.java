package class11;

public class T4StringMethods {
    public static void main(String[] args) {
        /* Create a string that will hold a sentence.
        Write a program to get a new String without any spaces.
        */
        String str="Hi my name is Uzair";
        System.out.println(str.replaceAll("[\\s]",""));

    }
}
