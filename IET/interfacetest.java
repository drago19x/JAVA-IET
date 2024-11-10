/**
 * interface
 */
interface drawable{
  void draw();

}

class rectangle implements drawable{
    public void draw(){
        System.out.println("drawing rectangle....");
    }
}

class circle implements drawable{
    public void draw(){
        System.out.println("drawing circle....");
    }
}


public class interfacetest {
    public static void main(String[] a){
        rectangle ac =new rectangle();
        ac.draw();

    }
}
