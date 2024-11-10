class marks{
    int maths;
    int hindi;
}

public class nonprimitive { 
    public static void main(String[] args) {
        marks m=new marks();
        m.maths=10;
        m.hindi=20;
        marks m2=m;
        m2.maths=20;
        System.out.println(m.maths);
    }
    
}
