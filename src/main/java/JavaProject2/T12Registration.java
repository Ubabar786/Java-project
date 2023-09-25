package JavaProject2;

import class23.Registration;

public class T12Registration {
    /*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
*/
    private String email;
    private String userName;
    private String passWord;

    public T12Registration(String email, String userName, String passWord) {
        setEmail(email);
        setUserName(userName);
        setPassWord(passWord);
    }

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Not an accepted email provider");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Username does not meet requirements.");
        }
    }

    public void setPassWord(String passWord) {
        if (!passWord.isEmpty() && passWord.length() > 6 && passWord != userName) {
            this.passWord = passWord;
        } else {
            System.out.println("Password does not meet requirements");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public static void main(String[] args) {
        Registration r = new Registration("ubabar7@yahoo.com", "Username123", "Password123");
        System.out.println("Email is: " + r.getEmail());
        System.out.println("Username is: " + r.getUsername());
        System.out.println("Password is: " + r.getPassword());
    }
}
