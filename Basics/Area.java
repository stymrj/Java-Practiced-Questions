package Basics;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

    // Area of Circle     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;  // here we have too declare float value -default its double
        System.out.print("Area of the Circle is: "+area);

        
    }
    
}
