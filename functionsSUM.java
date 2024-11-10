import java.util.Scanner;
public class functionsSUM {
    public static int calculateSum(int a , int b){
        int sum = a +b ;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Give First Number : ");
        int a = sc.nextInt();
        System.out.println("First Number is : " +a);
        System.out.println(" Give Second Number : " );
        int b = sc.nextInt();
        System.out.println("Second Number is : " +b);
        int sum = calculateSum(a,b);
        System.out.println("Sum of 2 numbers is : " +sum);
    }
}
