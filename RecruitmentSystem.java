package ASSIGNMENT2;

 import java.util.Scanner;

// Custom Exception for TooOlder
class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

// Custom Exception for TooYounger
class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}

public class RecruitmentSystem {

    // Method to check the candidate's age and throw appropriate exceptions
    public static void checkEligibility(String name, int age) throws TooOlderException, TooYoungerException {
        if (age > 45) {
            throw new TooOlderException("Candidate is too old: " + age + " years");
        } else if (age < 20) {
            throw new TooYoungerException("Candidate is too young: " + age + " years");
        } else {
            System.out.println("Candidate is eligible.");
            System.out.println("Name: " + name + ", Age: " + age + " years");
        }
    }

    public static void main(String[] args) {
        // Use Scanner to take name and age as input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter candidate's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter candidate's age: ");
        int age = scanner.nextInt();

        try {
            // Check eligibility based on age criteria
            checkEligibility(name, age);
        } catch (TooOlderException e) {
            // Handle TooOlderException
            System.out.println(e.getMessage());
        } catch (TooYoungerException e) {
            // Handle TooYoungerException
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }

}
