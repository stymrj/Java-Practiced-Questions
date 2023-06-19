package Loops2;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 1487558763;
        while(num>0){
            int lastDigit = num%10; //get the Last Digit of number 
            System.out.print(lastDigit);
            num = num/10; // Remove the LAst Digit
        }

    }
    
}
