package class16;

public class ConTester {
    public static void main(String[] args) {
      //  new DifferentAccessModifiers(); because it is private access modifier
        new DifferentAccessModifiers("Artur");
        new DifferentAccessModifiers(17); //only if package is the same
        new DifferentAccessModifiers(89.5);
    }
}
