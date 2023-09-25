package JavaProject2;

public class T4CountWords {
    /*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
*/
    public static void main(String[] args) {
        String input = "Hello my friends, welcome to my world!";
        String[] str = input.split(" ");
        System.out.println("Number of words: " + str.length);
    }
}
