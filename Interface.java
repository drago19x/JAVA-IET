package OOPS2;
interface Drawable {
    void draw();
}
//implementation by second user 
class Rectangle implements Drawable {
    public void draw () {
        System.out.println("drawing rectangle ");
    }
   
}
class Circle implements Drawable {
    public void draw () {
        System.out.println("drawing circle ");
    }
   
}

 class Interface {
   public static void main(String[] args) {
    Drawable d = new Rectangle ();
    d.draw();
   }
   
}
//difference between abstract class and interface class 