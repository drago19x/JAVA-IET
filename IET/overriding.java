class parent{
    void run(){
        System.out.println("hello from parent class");
    }
}


public class overriding extends parent{
    void run(){
        System.out.println("hello from child class");
    }
    public static void main(String[] args) {
        overriding o1=new overriding();
        o1.run();
    }
}
