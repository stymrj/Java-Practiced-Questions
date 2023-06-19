package Basics;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/* 
        String input = sc.next();
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);
*/
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println(sum);


    }
    
}
