import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take perimeter input from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Formula: Perimeter = 4 * side
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}

