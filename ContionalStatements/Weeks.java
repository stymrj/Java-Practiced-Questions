package ContionalStatements;

import java.util.Scanner;

public class Weeks {
    public static void main(String[] args) {
        /* Write a Java program to input week number(1-7) and print day of week name
          using switch case. */
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Day Number (1-7): ");
          int day = sc.nextInt();
          switch(day){
            case 1 : System.out.println("SUNDAY");
                    break;
            case 2 : System.out.println("MONDAY");
                    break;
            case 3 : System.out.println("TUESDAY");
                    break;
            case 4 : System.out.println("WEDNESDAY");
                    break;
            case 5 : System.out.println("THURDAY");
                    break;
            case 6 : System.out.println("FRIDAY");
                    break;
            case 7 : System.out.println("SATURDAY");
                    break;
            default : System.out.println("INVALID INPUT >>>>");
          }
    }
    
}
