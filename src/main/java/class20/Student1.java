package class20;

public class Student1 {

    void extraCurricular(){
        System.out.println("Student is doing Java");
    }
    void play(){
        System.out.println("Student is playing football");
    }
    void study(){
        System.out.println("Student is learning how to code");
    }
}
class SyntaxStudent extends Student1{
    void extraCurricular(){
        System.out.println("Student likes to nap instead");
    }
}
