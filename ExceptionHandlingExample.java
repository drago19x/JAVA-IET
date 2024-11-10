package ASSIGNMENT2;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // Handling NegativeArraySizeException
        try {
            System.out.println("Attempting to create an array with negative size...");
            int[] arr = new int[-5];  // This will throw NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        // Handling ArithmeticException
        try {
            System.out.println("Attempting to divide by zero...");
            int result = 10 / 0;  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        }

        // Program continues normally
        System.out.println("Program execution continues after exception handling.");
    }
}
