package Basics;
import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        int sum = a+b;

        // Arithmatic Operators -- BINARY OPERATORS
        System.out.println("Sum: " +sum);
        System.out.println("Difference: "+(a-b));
        System.out.println("Products : "+(a*b));
        System.out.println("Dividing: "+(a/b));
        System.out.println("Remainder: "+(a%b));

        // Arithmatic Operators -- UNary operators
        int d = 20;
        int e = ++d;
         System.out.println(++d);
         System.out.println(e);
         System.out.println(d++);



    }
    
}
