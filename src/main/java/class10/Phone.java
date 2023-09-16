package class10;

public class Phone {
    String name;
    String model;
    char generation;
    int year;
    double weight;

    void call() {
        System.out.println("Calling friends and family...");
    }

    void text() {
        System.out.println("Texting friends and family...");
    }

    void browse() {
        System.out.println("Browsing the internet...");
    }
}
