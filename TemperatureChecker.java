package ASSIGNMENT2;

import java.util.Scanner;

// Custom Exception for TooHot
class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

// Custom Exception for TooCold
class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class TemperatureChecker {

    // Method to check temperature and throw appropriate exceptions
    public static void checkTemperature(int temperature) throws TooHotException, TooColdException {
        if (temperature > 35) {
            throw new TooHotException("Temperature is too hot: " + temperature + "°C");
        } else if (temperature < 5) {
            throw new TooColdException("Temperature is too cold: " + temperature + "°C");
        } else {
            System.out.println("Temperature is normal: " + temperature + "°C");
        }
    }

    public static void main(String[] args) {
        // Use Scanner to read temperature from the command line
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        int temperature = scanner.nextInt();

        try {
            // Check the temperature and handle potential exceptions
            checkTemperature(temperature);
        } catch (TooHotException e) {
            // Handle TooHotException
            System.out.println(e.getMessage());
        } catch (TooColdException e) {
            // Handle TooColdException
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
