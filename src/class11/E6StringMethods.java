package class11;

public class E6StringMethods {
    public static void main(String[] args) {

        String str="fds fASD sg239 85()4!?><@ ~*&%TYH";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]"," "));
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[&-;]",""));

    }
}
