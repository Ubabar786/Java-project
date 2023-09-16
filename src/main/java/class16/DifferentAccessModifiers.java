package class16;

public class DifferentAccessModifiers {
 private DifferentAccessModifiers(){
     System.out.println("Private");
}
    DifferentAccessModifiers(String name) {
        System.out.println("Default");
    }
    protected DifferentAccessModifiers(int age) {
        System.out.println("Protected");
    }
            public DifferentAccessModifiers(double weight){
                System.out.println("Public");
            }
    public static void main(String[] args) {
        new DifferentAccessModifiers();
        new DifferentAccessModifiers("Artur");
        new DifferentAccessModifiers(17);
        new DifferentAccessModifiers(89.5);
    }
        }
