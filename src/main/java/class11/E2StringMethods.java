package class11;

public class E2StringMethods {
    public static void main(String[] args) {

        String str = "Batch 17 is great";

        //  for (int i = 0; i < str.length(); i++) {
        // System.out.print(str.charAt(i));

        int cnt = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'a' || str.charAt(j) == 'A') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
