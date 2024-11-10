package OOPsSampleCode;

abstract class Vehicle {
    abstract void startEngine();

    void fuel() {
        System.out.println("Filling fuel...");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();  // Output: Car engine started
        car.fuel();         // Output: Filling fuel...
    }
}
