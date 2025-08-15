import java.util.Scanner;

public class KmToMilesUserInput {
    public static void main(String[] args) {
        double km; // variable for kilometers

        // Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Conversion: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close scanner
        input.close();
    }
}
