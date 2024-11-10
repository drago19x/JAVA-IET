package OOPsSampleCode;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Polymorphsim {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw();  // Output: Drawing Circle

        shape = new Square();
        shape.draw();  // Output: Drawing Square
    }
}
