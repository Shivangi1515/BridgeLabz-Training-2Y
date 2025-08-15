import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula: n * (n - 1) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}
