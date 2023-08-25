package class9;

public class E22DArrays {
    public static void main(String[] args) {

        String[][] names=
                {
                        {"Hind", "Mikhail", "Ismael", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "Doe", "Mohammed"},
                        {"Gui", "Becky", "Front", "API"}
                };

        String[] row=names[2];

        //System.out.println(row[3]);
        for (String name:row) {
            System.out.println(name);

        }
    }
}
