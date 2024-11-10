package CW2;
import java.util.*;

public class greatestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        a=a>b?a:b;
        c=c>a?c:a;
        System.out.println(c);
    }
}
