package CW3;

class data{
    private
    String name;
    int makrs;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setmarks(int marks){
        this.makrs=marks;
    }
    public int getmarks(){
        return makrs;
    }
    data(){

    }
    data(String name,int marks){
        this.makrs=marks;
        this.name=name;
    }
}

public class student {
    public static void main(String[] args) {
        // data d1= new data();
        // d1.name="samarth";
        // d1.makrs=69;
        // System.out.println(d1.name+" "+d1.makrs);
        // data d2=new data("parth",76);
        // System.out.println(d2.name+" "+d2.makrs);
        data d1=new data("samarth",45);
        // d1.setmarks(45);
        // d1.setname("samarth");
        System.out.println(d1.getmarks()+" "+d1.getname());

    }
}
