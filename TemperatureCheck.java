package ASSIGNMENT2;

// Custom Exception for Too Hot condition
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// Custom Exception for Too Cold condition
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

// Main Class
public class TemperatureCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the temperature in Celsius as a command line argument.");
            return;
        }

        try {
            // Parse the temperature from the command line argument
            double temperatureInCelsius = Double.parseDouble(args[0]);

            // Check conditions for Too Hot and Too Cold
            if (temperatureInCelsius > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temperatureInCelsius < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Normal temperature.");
                double temperatureInFahrenheit = convertToFahrenheit(temperatureInCelsius);
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", temperatureInFahrenheit);
            }
        } catch (TooHot e) {
            System.err.println(e.getMessage());
        } catch (TooCold e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a numeric temperature value.");
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
