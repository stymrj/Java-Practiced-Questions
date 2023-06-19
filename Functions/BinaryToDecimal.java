package Functions;

public class BinaryToDecimal {
    //Converting Binary to Decimal - [ dec=dec+(LD*2^pow)]
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit = binNum%10; //calculate lastDigit
            decNum=decNum+ (lastDigit *(int)Math.pow(2, pow)); //calculating the Decimal number --int for typecasting as Math.pow return double
            pow++; //increased pow by 1
            binNum=binNum/10; // reduced binNumber by dividing 10.

        }

        System.out.println("Decimal of "+myNum+" = "+decNum);
    }
    public static void main(String[] args) {
      binToDec(1); // call laga rahe hai apne function ko
        
    }
    
}
