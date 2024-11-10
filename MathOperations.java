import java.util.Scanner;

public class MathOperations {

    // Square root function
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Cube root function
    public static double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    // Inverse function (1/x)
    public static double inverse(double number) {
        if (number == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return 1 / number;
    }

    // Sine function
    public static double sine(double angleInRadians) {
        return Math.sin(angleInRadians);
    }

    // Cosine function
    public static double cosine(double angleInRadians) {
        return Math.cos(angleInRadians);
    }

    // Tangent function
    public static double tangent(double angleInRadians) {
        return Math.tan(angleInRadians);
    }

    // Calculate the area of a circle (πr²)
    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Calculate the volume of a sphere (4/3 * πr³)
    public static double volumeOfSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Calculate the area of a rectangle (length * width)
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // Calculate the volume of a cube (side³)
    public static double volumeOfCube(double side) {
        return Math.pow(side, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Math Operations in Java:");

        // Square root
        System.out.print("Enter a number to find the square root: ");
        double number = scanner.nextDouble();
        System.out.println("Square Root: " + squareRoot(number));

        // Cube root
        System.out.print("Enter a number to find the cube root: ");
        number = scanner.nextDouble();
        System.out.println("Cube Root: " + cubeRoot(number));

        // Inverse
        System.out.print("Enter a number to find its inverse: ");
        number = scanner.nextDouble();
        System.out.println("Inverse: " + inverse(number));

        // Trigonometric functions
        System.out.print("Enter an angle (in radians) for trigonometric functions: ");
        double angle = scanner.nextDouble();
        System.out.println("Sine: " + sine(angle));
        System.out.println("Cosine: " + cosine(angle));
        System.out.println("Tangent: " + tangent(angle));

        // Area of circle
        System.out.print("Enter the radius of the circle to find its area: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + areaOfCircle(radius));

        // Volume of sphere
        System.out.print("Enter the radius of the sphere to find its volume: ");
        radius = scanner.nextDouble();
        System.out.println("Volume of Sphere: " + volumeOfSphere(radius));

        // Area of rectangle
        System.out.print("Enter the length and width of the rectangle to find its area: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + areaOfRectangle(length, width));

        // Volume of cube
        System.out.print("Enter the side of the cube to find its volume: ");
        double side = scanner.nextDouble();
        System.out.println("Volume of Cube: " + volumeOfCube(side));

        scanner.close();
    }
}
