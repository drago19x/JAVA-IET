package ASSIGNMENT2;
class Demo{
    int x;
    public Demo(int x){
        this.x = x;
    }
    public void display(){
        System.out.println("Value of x : " +this.x);
    }

}
public class queFifteen {
   public static void main(String[] args) {
    Demo d = new Demo(10);
    d.display();
}
   }


