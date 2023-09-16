package review6;

public class E2StringMethods {
    public static void main(String[] args) {
        String str="This is java class";
      boolean starts=str.startsWith("T");
      boolean ends=str.endsWith("s");
      boolean endWord=str.endsWith("class");
      int num='a';
        System.out.println(num);
        System.out.println(str.contains("java"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf(97));
        System.out.println(starts+" "+ends+" "+endWord);
        char c=str.charAt(5);
        System.out.println(c);
        String.valueOf(12); //instance method

    }
}
