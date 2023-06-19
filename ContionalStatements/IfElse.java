package ContionalStatements;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
    // here we are using if-else condition 

        if(age >= 18){
            System.out.print("Wohho! You Can Vote Now...");
        }
        if(age>13 && age<17){
            System.out.println("Welcome to Teenage!");
        }
        else{
            System.out.print("Arrey Bachhe!! jake Padhai karo abhi...");
        }

    }
    
}
