package ContionalStatements;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Using Switch Statements 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Operator: ");
        char operator = sc.next().charAt(0);
        
        switch(operator){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Wrong Operator");

        }

    }
}
