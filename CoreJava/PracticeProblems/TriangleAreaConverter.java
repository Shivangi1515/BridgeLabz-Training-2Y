import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking base and height input in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = input.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Convert to square centimeters
        // 1 inch = 2.54 cm, so 1 in² = (2.54 * 2.54) cm²
        double areaCm = areaInches * (2.54 * 2.54);

        // Output
        System.out.println("The area of the triangle is " + String.format("%.2f", areaInches)
                + " square inches and " + String.format("%.2f", areaCm) + " square centimeters.");

        input.close();
    }
}
