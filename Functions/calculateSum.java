package Functions;
import java.util.Scanner;

public class calculateSum {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 'A': " );
        int a = sc.nextInt();
        System.out.print("Enter Number 'B': " );
        int b = sc.nextInt();
        int sol = sum(a, b);
        System.out.println("Sum is:"+sol);
    }
    
}
