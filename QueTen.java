package ASSIGNMENT2;
class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed ;
    public Vehicle(String regnNumber, String color, int speed, String ownerName){
        this.regnNumber = regnNumber;
        this.color = color;
        this.speed = speed;
        this.ownerName = ownerName;
    }
    public void showData(){
        System.out.println("this is a vehicle class ");
    }
}
class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, String color, int speed, String ownerName, int routeNumber) {
        super(regnNumber, color, speed, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Bus [Route Number: " + routeNumber + ", RegnNumber: " + regnNumber + 
                ", Color: " + color + ", Speed: " + speed + ", Owner: " + ownerName + "]");
    }
}
class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, String color, int speed, String ownerName, String manufacturerName) {
        super(regnNumber, color, speed, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Car [Manufacturer: " + manufacturerName + ", RegnNumber: " + regnNumber +
                ", Color: " + color + ", Speed: " + speed + ", Owner: " + ownerName + "]");
    }
}

public class QueTen {
    public static void main(String[] args) {
        Bus bus = new Bus("AB1234", "Blue", 60, "John Doe", 15);
        bus.showData();

        Car car = new Car("XY9876", "Red", 80, "Jane Smith", "Toyota");
        car.showData();
    }
}
