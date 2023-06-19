package Loops2;

import java.util.Scanner;

public class NumberExceptMultipleOf10 {
    // Display all numbers enterred by user except multple of 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Enter the Number: ");
                int num = sc.nextInt();
                if( num %10 ==0){
                    continue;
                }
                System.out.println("Number was: "+num);
            }while(true);
        }
    }


