import java.util.*;

class Commision{
    private
    int sales;
    public int getCommision(){
        return (sales*10)/100;
    }
    public void  setCommision(int sale){
        this.sales=sale;
    }
}

class demo{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int sale=sc.nextInt();
        if(sale>0){
            Commision c1= new Commision();
            c1.setCommision(sale);
            int comm= c1.getCommision();
            System.out.println(comm);

        }
        else{
            System.out.println("invalid input");
        }
    }
}
