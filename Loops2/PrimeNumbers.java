package Loops2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime=true;

        if(num%2==0){
            System.out.println("hey! its prime...");
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if( num%i == 0){
                    isPrime = false;
                }
    
            }
    
            if(isPrime == true){
                  System.out.println("Number is prime.");
            }else{
                System.out.println("Number is not prime");
            }

        }
    }
}
