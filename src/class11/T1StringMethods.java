package class11;

public class T1StringMethods {
    public static void main(String[] args) {

        String str="hello";
            if(str.length()%2!=0&&str.length()>=3){
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));
        }
    }
}
