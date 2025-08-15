import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + String.format("%.2f", inches));

        // Close scanner
        input.close();
    }
}
