import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();

        // Check for division by zero
        if (denominator == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            double result = numerator / denominator;
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
