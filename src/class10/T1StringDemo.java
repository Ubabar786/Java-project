package class10;

public class T1StringDemo {
    public static void main(String[] args) {

        String userName="";
        String passWord="";
        String confirmPassWord="";

        if(userName.isEmpty()||passWord.isEmpty()) {
            System.out.println("Username or Password cannot be empty");

        }else if(passWord.length()<8) {
            System.out.println("Password is too short");
        }else if (passWord.contains(userName)) {
            System.out.println(passWord.contains("Password cannot contain username"));
        } else if (!passWord.equals(confirmPassWord)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");

        }
    }
}
