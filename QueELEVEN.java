package ASSIGNMENT2;
class Num {
    protected int number;
    public Num(int number){
        this.number = number;
    }
    public void shownum(){
        System.out.println("Number : " + number);
    }
}
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void shownum() {
        System.out.println("Number in Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Number in Octal: " + Integer.toOctalString(number));
    }
}

public class QueELEVEN {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.shownum();

        HexNum hexNum = new HexNum(255);
        hexNum.shownum();
    }
}
