package class12;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {

        String name="Babar";
        name.toLowerCase(); //can't reassign the variable
        System.out.println(name);

        StringBuilder sb=new StringBuilder("Sunday");
        sb.reverse(); //changeable
        System.out.println(sb);
    }
}
