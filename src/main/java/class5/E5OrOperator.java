package class5;

public class E5OrOperator {
    public static void main(String[] args) {

        boolean broughtFlowers = true;
        boolean broughtChocs = false;
        boolean allMyMistake = true;

        if (broughtChocs || broughtFlowers || allMyMistake) {
            System.out.println("Wife is happy");
        } else {
            System.out.println("Wife is sad");
        }
    }
}
