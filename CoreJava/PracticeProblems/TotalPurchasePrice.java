import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take unit price from user
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        // Take quantity from user
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}
