package JavaProject2;

public class T6FirstNonRepeating {
    /*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
*/
    public static char findFirstNonRepeatingCharacter(String str) {
        char[] cArr = str.toCharArray();
        for (char currChar : cArr) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (currChar == c) {
                    count++;
                }
            }
            if (count == 1) {
                return currChar;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        char firstNonRep = findFirstNonRepeatingCharacter("abracadabra");
        if (firstNonRep != 0) {
            System.out.println("The first non repeating character is: " + firstNonRep);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
