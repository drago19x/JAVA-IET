package ASSIGNMENT2;

import java.util.HashMap;
import java.util.Scanner;

// Custom Exception for no matching country
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {

    // Method to find the capital of a country
    public static String getCapital(String country) throws NoMatchFoundException {
        // A HashMap to store country-capital pairs
        HashMap<String, String> countries = new HashMap<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington, D.C.");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Berlin");
        countries.put("Canada", "Ottawa");

        // Check if the country exists in the map
        if (countries.containsKey(country)) {
            return countries.get(country);
        } else {
            // Throw custom exception if no match found
            throw new NoMatchFoundException("No match found for the country: " + country);
        }
    }

    public static void main(String[] args) {
        // Use Scanner to read input from the command line
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = scanner.nextLine();

        try {
            // Attempt to get the capital of the entered country
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            // Catch and display custom exception message
            System.out.println(e.getMessage());
        }

        // Closing the scanner
        scanner.close();
    }
}
