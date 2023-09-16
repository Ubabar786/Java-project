package class22;

public interface MoveAble {
    public abstract void move();
    void method1();
}

interface WashAble{
    void wash();
    void method1();
}
class Dog implements MoveAble, WashAble{

    @Override
    public void move() {
        System.out.println("Dogs can jump, run, and go in circles");
    }

    @Override
    public void method1() {
        System.out.println("I don't care where i am coming from");
    }

    @Override
    public void wash() {
        System.out.println("You can safely wash a Dog");

    }
}

class Car implements MoveAble, WashAble{
    @Override
    public void move() {
        System.out.println("Car can move forward, backward and go in circles");
    }

    @Override
    public void method1() {
        System.out.println("I don't care where i am coming from");
    }

    @Override
    public void wash() {
        System.out.println("You can wash a car");
    }
}