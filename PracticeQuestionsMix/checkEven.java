package PracticeQuestionsMix;

import java.util.Scanner;

public class checkEven {

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        if(isEven(num)){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
    
}
