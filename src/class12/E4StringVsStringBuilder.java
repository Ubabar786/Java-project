package class12;

public class E4StringVsStringBuilder {
    public static void main(String[] args) {

        String name1,name2,name3,name4;
        name1="USA";
        name2="USA";
        name3="USA";
        name4="USA";

        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
    sb.reverse();
    sf.reverse();
    }
}
