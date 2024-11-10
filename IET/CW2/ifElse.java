package CW2;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //check year is leap or not
        System.out.println("enter the year");
        int y=sc.nextInt();
        if (y%400==0) {
            System.out.println("leap year");
        }
        else if (y%100==0) {
            System.out.println("not a leap year");
        }
        else if (y%4==0) {
            System.out.println("leap year");
        }
        else
        System.out.println("not leap year");
    }
}
