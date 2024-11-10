import java.util.Scanner;

class students{
    int maths,phy,chem;
    students(int maths,int phy,int chem){
        this.maths=maths;
        this.phy=phy;
        this.chem=chem;
        if(maths>=60&&phy>=50&&chem>=40||maths+phy+chem>=200||maths+phy>=150){
            System.out.println("eligible");
        }
        else 
        System.out.println("not eligible");
    }

}




public class eligible {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        students s1= new students(100, 0, 2);  
        students s2= new students(100, 100, 2);  
        students s3= new students(100, 0, 200);  

    }
}
