package OOP.FormatExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
    public static void main(String[] args) {
        String email = "johndoe@example.com";
        Pattern emailPattern = Pattern.compile("^\\w+@[a-zA-Z0-9\\.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = emailPattern.matcher(email);
        boolean isValidEmail = matcher.matches();
        System.out.println(email + " is valid: " + isValidEmail); // Output: johndoe@example.com is valid: true

    }
}
