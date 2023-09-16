package class5;

public class E6OrOperator {
    public static void main(String[] args) {

        String genre = "thriller";
        if (genre.equals("thriller")||genre.equals("horror")||genre.equals("comedy")) {
            System.out.println("I am going to watch this");
        }else {
            System.out.println("I don't want to watch that");

        }
    }
}