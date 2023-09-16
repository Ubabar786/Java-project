package class23;

public class User {
   private String name;
    private int age;
    private String userName;
    private String passWord;

    public User(String name, int age, String userName, String passWord) {
        setName(name);
        setAge(age);
        setUserName(userName);
        setPassWord(passWord);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}