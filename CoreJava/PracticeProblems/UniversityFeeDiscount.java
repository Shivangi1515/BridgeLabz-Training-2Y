public class UniversityFeeDiscount {
    public static void main(String[] args) {
        // Given values
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
