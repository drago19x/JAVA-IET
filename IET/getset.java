/**
 * getset
 */
/**
 * Innergetset
 */
class Innergetset {
private
int a;
String s1;
public int get(){
    return a;
}
public void set (int a){
    this.a=a;
}
public String getname(){
    return s1;
}
public void setname(String a){
    this.s1=a;
}
}
public class getset {

    public static void main(String[] args) {
        Innergetset s1 = new Innergetset();
        s1.setname("hello");
        System.out.println(s1.getname());
    }
}