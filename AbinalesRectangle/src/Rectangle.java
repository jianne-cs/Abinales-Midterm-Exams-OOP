// Encapsulation: Hiding data and showing only necessary information
public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Abstraction: Showing only necessary information
    public void displayInfo() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
