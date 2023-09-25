package JavaProject2;

public interface T9Shape {
    /*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculate Perimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
*/
    double calcArea();

    double calcPerimeter();
}

class Circle implements T9Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}

class Square implements T9Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        double area = side * side;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        System.out.println("Circle area: " + circle.calcArea());
        System.out.println("Circle perimeter: " + circle.calcPerimeter());

        Square square = new Square(8.0);
        System.out.println("Square area: " + square.calcArea());
        System.out.println("Square perimeter: " + square.calcPerimeter());

    }
}