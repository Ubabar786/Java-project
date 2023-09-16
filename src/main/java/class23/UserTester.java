package class23;

public class UserTester {
    public static void main(String[] args) {

        User u = new User("Uzair", 25, "Uzairb", "Pass123");

        System.out.println("Name: " + u.getName());
        System.out.println("Age: " + u.getAge());
        System.out.println("Username: " + u.getUserName());
        System.out.println("Password: " + u.getPassWord());

    }
}
