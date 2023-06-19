package Functions;

public class fxnOverloading {
    // Function Overloading is - fxn with same name but different parameters 

    // using Parameters
    public static int sum(int a, int b){
        return a+b;
    }
    // here we used same function but used different parameters
    public static int sum(int a, int b,int c){
        return a+b+c;
    }


    // using DataTypes! 
    public static float sum(float a, float b){
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(sum(2.5f, 5.9f));
        System.out.println(sum(2, 3, 4));
        
    }
    
}
