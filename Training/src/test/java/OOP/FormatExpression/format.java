package OOP.FormatExpression;

public class format {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;

        String message = String.format("Hello, my name is %s and I am %d years old.", name, age);
        System.out.println(message); // Output: Hello, my name is Alice and I am 30 years old.

    }
}
