import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet from user
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();

        // 1 yard = 3 feet
        double yards = feet / 3;

        // 1 mile = 1760 yards
        double miles = yards / 1760;

        // Output
        System.out.println("The distance in feet is " + feet +
                           ", which is " + yards + " yards and " + miles + " miles.");

        input.close();
    }
}
