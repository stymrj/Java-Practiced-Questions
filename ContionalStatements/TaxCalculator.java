package ContionalStatements;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        int tax=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
            int salary = sc.nextInt();
            
        if(salary<500000){
            tax =0;
        }
        else if (salary >= 500000 && salary < 1000000){
            tax = (int) (salary *0.2);
        }
        System.out.println("Your Tax is: "+tax);

        
    }
    
}
