package CW;
import java.util.Scanner;
public class remainder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dividend");
        int dividend=sc.nextInt();
        System.out.println("enter divisor");
        int divisor=sc.nextInt();
        System.out.println("remainder when "+dividend+" is divided by "+divisor+" is "+(dividend%divisor));

    }
}
