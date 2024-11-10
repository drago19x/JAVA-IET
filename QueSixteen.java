package ASSIGNMENT2;

class Demo {
    static int count = 0;  // Static variable shared among all objects

    public Demo() {
        count++;
    }

    static void displayCount() {  // Static method
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo.displayCount();
    }
}
