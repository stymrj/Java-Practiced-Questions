package Functions;

public class Factorial {
// ek function banaya jo factorial calculate krega
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
    // printing the factorial of the different numbers
        System.out.println(fact(5));
        System.out.println(fact(4));
        System.out.println(fact(3));//called the fxn and printed the value
        System.out.println(fact(2));
        System.out.println(fact(1)); // here we are calling multiple times for differenet numbers
        
    }

    
}
