// Interface: Defining a contract
interface Shape {
    double getArea();
    double getPerimeter();
}

// Implementing the interface
class RectangleImpl extends Rectangle implements Shape {
    public RectangleImpl(double width, double height) {
        super(width, height);
    }

    // Implementing the interface methods
    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        // Create an instance of the RectangleImpl class
        RectangleImpl rectangle = new RectangleImpl(5.0, 10.0);
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
