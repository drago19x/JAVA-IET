package ASSIGNMENT2;
import java.util.Scanner;

// Custom Exception for negative age
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

// Main Class

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Input age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            // Check if age is negative
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }

            // If age is valid
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NegativeAgeException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
