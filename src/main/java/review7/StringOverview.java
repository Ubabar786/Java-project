package review7;

public class StringOverview {
    public static void main(String[] args) {

        String phone="iPhone";

        //two ways to create a String

        String colour=new String("Yellow");

        String day=new String();
        day="Thursday";

        String sentence="   Today is September 7    ";

        int size=sentence.length();
        System.out.println("My sentence length is "+size);

        sentence=sentence.trim();
        System.out.println("Cuts out white spaces in " +sentence);

        String[] words = sentence.split(" ");
        System.out.println(words[2]);

        String replStr=sentence.replace("Today", "Tomorrow");
        System.out.println(replStr);

        String str1="Hi Hi Friends";
        str1=str1.replace("Hi", "Hello");
        System.out.println(str1);

        str1=str1.replaceAll("Hello", "Bye");
        System.out.println(str1);

        char letter=str1.charAt(1);
        System.out.println(letter);

        int indexOfCharB=str1.indexOf('B');
        System.out.println(indexOfCharB);

        for (int i = 10; i < 12; i++) {

        }

        for (int i = 0; i < 12; i++) {

        }
    }
}
