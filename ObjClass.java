package ASSIGNMENT2;
abstract class ThreeDObject {
    abstract double volume();
    abstract double wholeSurfaceArea();
}
class Box extends ThreeDObject {
    double length , width , height;
    Box(double length , double width , double height){
        this.length = length;
        this.width  = width;
        this.height = height;
    }
    @Override
    double volume() {
        return length * width * height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + length * height);
    }
}
class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double volume() {
        return Math.pow(side, 3);
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}

public class ObjClass {
    public static void main(String[] args) {
        ThreeDObject box = new Box(2, 3, 4);
        System.out.println("Box Volume: " + box.volume());
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());

        ThreeDObject cube = new Cube(5);
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
    }
}
