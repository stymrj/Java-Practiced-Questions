package ContionalStatements;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        

        // approach - A (if else)
        if(num>=0){
            System.out.println("Positive Number has been entered");
        }
        else{
            System.out.println("Its Negative Number");
        }

        // Approach - B ( Else if )
        System.out.println("Enter the Number2: ");
        int num2= sc.nextInt();

        if(num2>0){
            System.out.println("Positive");
        }
        else if(num==0){
            System.out.println("Its Zero !");
        }
        else{
            System.out.println("Negative");
        }

        }       
    }
