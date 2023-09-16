package class23;

public class Registration {
    private String email;
    private String username;
    private String password;
    public Registration(String email, String username, String password) {
        setEmail(email);
        setUsername(username);
        setPassword(password);
    }
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email address. Use Yahoo email addresses.");
        }
    }
    public void setUsername(String username) {
        if (isValidUsername(username)) {
            this.username = username;
        } else {
            System.out.println("Invalid username. Username should be at least 6 characters long.");
        }
    }
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password should be at least 6 characters long, and should not contain the username.");
        }
    }
    public boolean isValidEmail(String email) {
        return email.toLowerCase().endsWith("@yahoo.com");
    }
    public boolean isValidUsername(String username) {
        return username.length() > 6;
    }
    public boolean isValidPassword(String password) {
        return password.length() > 6 && !password.contains(username);
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}