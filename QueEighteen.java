package ASSIGNMENT2;
interface Interface1 {
    void methodA1();
    void methodA2();
}

// Second Interface
interface Interface2 {
    void methodB1();
    void methodB2();
}

// Third Interface
interface Interface3 {
    void methodC1();
    void methodC2();
}

// Inherited Interface
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void methodD();
}

// Concrete Superclass
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("Method from ConcreteClass");
    }
}
class MyClass extends ConcreteClass implements CombinedInterface {
    // Implement Interface1 methods
    @Override
    public void methodA1() {
        System.out.println("methodA1 from Interface1");
    }

    @Override
    public void methodA2() {
        System.out.println("methodA2 from Interface1");
    }

    // Implement Interface2 methods
    @Override
    public void methodB1() {
        System.out.println("methodB1 from Interface2");
    }

    @Override
    public void methodB2() {
        System.out.println("methodB2 from Interface2");
    }

    // Implement Interface3 methods
    @Override
    public void methodC1() {
        System.out.println("methodC1 from Interface3");
    }

    @Override
    public void methodC2() {
        System.out.println("methodC2 from Interface3");
    }

    // Implement CombinedInterface method
    @Override
    public void methodD() {
        System.out.println("methodD from CombinedInterface");
    }
}

public class QueEighteen {
    public static void methodForInterface1(Interface1 i1) {
        i1.methodA1();
        i1.methodA2();
    }
}
