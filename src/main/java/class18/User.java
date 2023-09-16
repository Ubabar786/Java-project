package class18;

public class User {
    String name;
    String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class UserInfo extends User {
    String address;

    public UserInfo(String name, String phoneNumber, String address) {
        super(name, phoneNumber);
        this.address = address;
    }

    void userDetails() {
        System.out.println("Name: " + name + " Phone Number: " + phoneNumber + " Address: " + address);
    }
}

class UserTester {
    public static void main(String[] args) {
        UserInfo us1 = new UserInfo("Uzair", "+7985678432", "London");
        us1.userDetails();
    }
}