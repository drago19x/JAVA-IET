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

class babydog extends dog{
    void weep(){
        System.out.println("weeping...");
    }
}


class multiInhe {
    public static void main(String[] args) {
        babydog d1 = new babydog();
        d1.bark();
        d1.eat();
        d1.weep();
    }
}



