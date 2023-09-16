package review2;

public class E1TypeCasting {
    public static void main(String[] args) {

        //float number=(int)455; // redundant/automatic
        int number=(int)455.555;
        System.out.println(number);
        float number2=20.100F;
        double number3=(number2);
        System.out.println(number3);

        //boolean bool=(boolean)12.5; error
        char c=(char)65; //this will present an A or with 66 will be 66. UNICODE table
        System.out.println(c);
        //String s=(String)'C';

    }
}
