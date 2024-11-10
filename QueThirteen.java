package ASSIGNMENT2;
class Grandparent {
    void display() {
        System.out.println("This is Grandparent");
    }
}

class Parent extends Grandparent {
    void show() {
        System.out.println("This is Parent");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("This is Child");
    }
}

public class QueThirteen {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
        c.print();
    }
}
