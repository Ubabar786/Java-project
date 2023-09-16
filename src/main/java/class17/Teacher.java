package class17;

public class Teacher {
    String name;
    String subject;
    int yearGroup;
    void printInfo(){
        System.out.println(name+" "+subject+" "+yearGroup);
    }
}
class MathTeacher extends Teacher{
String name;
void printName(){
    System.out.println("Uzair");
}
}
class ChemTeacher extends MathTeacher{

}
class PianoTeacher extends ChemTeacher{

}