//why abstact method if no body

abstract class bike {
    abstract void run();
    void say(){
        System.out.println("i am singing");
    }
}


public class abstractclass extends bike{
    void run(){
        System.out.println("running....");
    }
    public static void main(String[] args) {
        bike odj = new abstractclass();
        odj.run();
        odj.say();
    }
}
