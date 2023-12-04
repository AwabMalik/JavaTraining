package OOP.Abstraction;

public class main {
    public static void main(String[] args) {
        Shape circle = new Circle("red", 5);
        System.out.println("Circle area: " + circle.getArea());

        Shape rectangle = new Rectangle("blue", 10, 4);
        System.out.println("Rectangle area: " + rectangle.getArea());

    }
}
