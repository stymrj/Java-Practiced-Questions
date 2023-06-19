package PracticeQuestionsMix;

import java.util.Scanner;

public class AverageOfNumbers {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd Number: ");
        double b = sc.nextDouble();
        System.out.println("Enter 3rd Number: ");
        double c = sc.nextDouble();
        System.out.println("average is: "+average(a,b,c));
    }

    public static double average(double a, double b, double c){ 
        return (a+b+c)/3;  
    }
    
}
