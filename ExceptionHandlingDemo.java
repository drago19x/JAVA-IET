package ASSIGNMENT2;
import java.io.IOException;

public class ExceptionHandlingDemo {

    // Method that declares exceptions using 'throws'
    public static void riskyMethod() throws IOException {
        System.out.println("Inside riskyMethod");

        // Throwing an IOException explicitly using 'throw'
        throw new IOException("IO Exception occurred");
    }

    public static void main(String[] args) {
        try {
            // Handling a custom exception with 'throw'
            System.out.println("Throwing ArithmeticException explicitly.");
            throw new ArithmeticException("Manually thrown ArithmeticException");

        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } finally {
            // This block will always execute regardless of exception
            System.out.println("Inside finally block after handling ArithmeticException.");
        }

        try {
            // Calling a method that declares exceptions with 'throws'
            riskyMethod();

        } catch (IOException e) {
            // Catch block to handle IOException
            System.out.println("Caught IOException: " + e.getMessage());

        } finally {
            // This block will always execute
            System.out.println("Inside finally block after riskyMethod.");
        }

        // Code to show that program continues after exception handling
        System.out.println("Program execution continues after exception handling.");
    }
}
