package LOOPS;

import java.util.Scanner;

public class First10NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Range: ");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            System.out.print(counter +" ");
            counter++;
        }System.out.println();
        
    }
    
}
