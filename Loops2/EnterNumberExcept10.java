package Loops2;

import java.util.Scanner;

public class EnterNumberExcept10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the Number: ");
            int num = sc.nextInt();
            if( num%10 == 0){
                break;
            }
        }while(true);
        System.out.println("out of loop");
    }

}
