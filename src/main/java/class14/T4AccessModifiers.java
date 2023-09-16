package class14;

public class T4AccessModifiers {
    public static void main(String[] args) {
        System.out.println(vowelsOnly("YerbolBadBoy"));
    }
    private static String vowelsOnly(String str) {
      return  str = str.replaceAll("[^aeiouAEIOU]", "");
    }
}

