package class9;

import java.util.Arrays;

public class E12DArrays {
    public static void main(String[] args) {

        String[][] names=
                {
                        {"Hind", "Mikhail", "Ismael", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "Doe", "Mohammed"},
                        {"Gui", "Becky", "Front", "API"}
                };

       String[] row=names[0];

       System.out.println(Arrays.toString(row));
    }
}
