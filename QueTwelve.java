package ASSIGNMENT2;
class Distance {
    protected double miles;

    public Distance(double miles) {
        this.miles = miles;
    }

    public void travelTime() {
        double time = miles / 60;
        System.out.println("Time to cover " + miles + " miles at 60 mph: " + time + " hours");
    }
}
class DistanceMKS extends Distance {
    public DistanceMKS(double kilometers) {
        super(kilometers);
    }

    @Override
    public void travelTime() {
        double time = miles / 100;
        System.out.println("Time to cover " + miles + " kilometers at 100 km/h: " + time + " hours");
    }
}
public class QueTwelve {
    public static void main(String[] args) {
        Distance distMiles = new Distance(120);
        distMiles.travelTime();

        DistanceMKS distKm = new DistanceMKS(200);
        distKm.travelTime();
    }
}
