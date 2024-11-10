class animal {
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking...");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("meowing...");
    }
}


class hierarchical {
    public static void main(String[] args) {
        cat d1 = new cat();
        //d1.bark();
        d1.eat();
        d1.meow();
    }
}
