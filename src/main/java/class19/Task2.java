package class19;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments
and observe result.
*/

public class Task2 {
    public static void print(){
        System.out.println("Java is great");
    }
    public static void print(String word){
        System.out.println("Java is "+word);
    }
    public static void print(String word, String word1){
        System.out.println("Java is "+word+word1);
    }

    public static void main(String[] args) {
        print();
        Task2.print("Wonderful & ", "Amazing");
    }
}
