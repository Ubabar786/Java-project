package class10;

public class Student {
    //Properties/Attributes
    String name;
    int age;
    String id;
    // Methods/functions/behaviours

    void study() {
        System.out.println("Studying 16 hours a day......");
    }
    public static void main(String[]   args){
        // we are creating an actual student by using the Student Class
        Student uzairObj=new Student();
        uzairObj.name="Uzair";
        uzairObj.age=20;
        uzairObj.id="abc123";
        uzairObj.study(); //scanner.nextInt();

}
}
