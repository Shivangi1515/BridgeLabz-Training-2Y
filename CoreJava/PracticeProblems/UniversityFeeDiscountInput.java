import java.util.Scanner;

public class UniversityFeeDiscountInput {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Taking fee input
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        // Taking discount percentage input
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculating discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculating final discounted fee
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        // Close scanner
        input.close();
    }
}
