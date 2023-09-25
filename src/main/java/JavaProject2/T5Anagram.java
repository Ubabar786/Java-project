package JavaProject2;

import java.util.Arrays;

public class T5Anagram {
    /*
Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
*/
    public static void main(String[] args) {
        String s1 = "Silent";
        String s2 = "Listen";

        char[] c1 = s1.toLowerCase().toCharArray(); //{s,i,l,e,n,t}
        char[] c2 = s2.toLowerCase().toCharArray(); //{l,i,s,t,e,n}
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isAnagram = Arrays.equals(c1, c2);

        System.out.println(isAnagram);
    }
}
