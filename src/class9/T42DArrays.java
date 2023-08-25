package class9;

public class T42DArrays {
    public static void main(String[] args) {

        String[][] names =
                {
                        {"Ford", "Chevy", "Dodge"},
                        {"BMW", "Audi", "Merc"},
                        {"Toyota", "Honda", "Suzuki"},
                        {"Ferrari", "Lamborghini", "Maserati"}
                };

        for (String[] row : names) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("===============");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }
    }
}
