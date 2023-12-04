package OOP.Abstraction;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea(); // Abstract method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
