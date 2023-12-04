package OOP.Inheritance;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Call the superclass constructor
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override // Override the getArea() method from the parent class
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
