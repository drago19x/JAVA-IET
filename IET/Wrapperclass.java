public class Wrapperclass {
    public static void main(String[] args) {
        Integer x1=300,x2=300;//x1,x2 are refrences that are diffrent objects currently
        if(x1==x2)
        System.out.println("same");
        else
        System.out.println("not same");
        int x3=300;
        if(x1==x3)//x1 is refrence but it auto unbox 
        System.out.println("same");
        else
        System.out.println("not same");


    }
}
