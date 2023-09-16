package JavaProject1;

public class T10Duplicate {
    public static void main(String[] args) {
        // Write a program to print out duplicate elements from an Array of Strings?
        String[] names = {"Uzair", "Amber", "Asia", "Zainab", "Uzair", "Sadiq", "Amber"};

        for (int i = 0; i < names.length; i++) {

            String array = names[i];

            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("The duplicate element is: " + names[j]);
                }
            }
        }
    }
}
