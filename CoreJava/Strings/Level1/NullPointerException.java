package CoreJava.Strings.Level1;

public class NullPointerException {

    public static void generateException() {
        String text = null;   // text is null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method that handles NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Generating Exception (no handling) ===");
        
        // generateException();

        System.out.println("\n=== Handling Exception (with try-catch) ===");
        handleException();
    }
    
}
