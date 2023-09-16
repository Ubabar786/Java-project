package class20;

public class E3TypeCasting {
    public static void main(String[] args) {

        // call to the constructor below
        Student s1=new Student("Uzair", "A123");
        Student s2=new Student("Ahmed", "B123");

        Student[] arr={new Student("Uzair", "A123"), new Student("Ahmed", "B123")};

       // arr[1].printInfo();
        //s1.printInfo();

        for (int i = 0; i < arr.length; i++) {
            Student s=arr[i];
            s.printInfo();

        }

        int num=(int)12.5;
        System.out.println(num);
        double age=10;

        Animal a=new Dog();
        Dog d=(Dog)new Animal();



    }
}
