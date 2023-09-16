package class20;

public class StudentTester {
    public static void main(String[] args) {
        Student1[] arr = {new Student1(), new SyntaxStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].study();
            arr[i].play();
            arr[i].extraCurricular();

        }
    }
}
