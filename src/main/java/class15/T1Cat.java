package class15;

public class T1Cat {

    private String name;

    public T1Cat(String cName) {
        name = cName;
        System.out.println("Executed constructor with parameter " + cName);
    }

    public T1Cat() {
        System.out.println("Executed constructor with NO parameter");
    }

    public static void main(String[] args) {

       new T1Cat();
      // new T1Cat("Bengal");
    }
}