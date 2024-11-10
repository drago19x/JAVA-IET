package CW3;



public class fractionclass {
    static int a=0;
    static class Fraction{
        int num;
        int den;
        Fraction(int num,int den){
            this.num=num;
            this.den=den;
        }
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(3, 7);
        int a[]=new int[10];
        a[0]=20;
        fractionclass f2=new fractionclass();
        f2.a=1;
        System.out.println(fractionclass.a);
        fractionclass f3=new fractionclass();
        System.out.println(f3.a);



    }
}
