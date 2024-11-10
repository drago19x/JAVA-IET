package ASSIGNMENT2;
import java.util.Scanner;
// Custom Exception for invalid user input
class InvalidUserInput extends Exception {
    public InvalidUserInput(String message) {
        super(message);
    }
}

// Main Class


public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input username
        System.out.print("Enter username (minimum 6 characters): ");
        String username = scanner.nextLine();

        // Input password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Input password confirmation
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            // Check username length
            if (username.length() < 6) {
                throw new InvalidUserInput("Username must be at least 6 characters long.");
            }

            // Check if passwords match
            if (!password.equals(confirmPassword)) {
                throw new InvalidUserInput("Passwords do not match.");
            }

            // If both checks pass
            System.out.println("Registration successful!");
            System.out.println("Username: " + username);
        } catch (InvalidUserInput e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
