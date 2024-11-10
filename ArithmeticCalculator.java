package ASSIGNMENT2;

// Custom Exception Class
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

// Main Class
public class ArithmeticCalculator {
    public static void main(String[] args) {
        try {
            double result1 = calculateDivision(10, 0); // This will cause a divide by zero
            System.out.println("Result of Division: " + result1);
        } catch (CustomArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            double result2 = calculateSquareRoot(-16); // This will cause an invalid square root
            System.out.println("Result of Square Root: " + result2);
        } catch (CustomArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to perform division
    public static double calculateDivision(double numerator, double denominator) throws CustomArithmeticException {
        if (denominator == 0) {
            throw new CustomArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }

    // Method to calculate square root
    public static double calculateSquareRoot(double number) throws CustomArithmeticException {
        if (number < 0) {
            throw new CustomArithmeticException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(number);
    }
}
