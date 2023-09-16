package class9;

public class E92DArrays {
    public static void main(String[] args) {

        String[][] names =
                {
                        {"Hind", "Mikhail", "Ismael", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "Doe", "Mohammed"},
                        {"Gui", "Becky", "Front", "API"}
                };

        for (String[] row : names) {
            for (String col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
