package ASSIGNMENT2;

public class QueSeventeen {
    public static void main(String[] args) {
        int number = 2415;
        String numStr = Integer.toString(number);
        int sum = 0;
        
        for (int i = 0; i < numStr.length() - 1; i++) {
            // Extract consecutive two digits and convert them to an integer
            String consecutiveDigits = numStr.substring(i, i + 2);
            sum += Integer.parseInt(consecutiveDigits);
        }
        
        System.out.println("Sum of numbers formed by consecutive digits: " + sum);
    }
}
