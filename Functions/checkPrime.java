package Functions;

public class checkPrime {
    public static boolean isPrime(int n){
        if(n == 2){ // if number is 2 then always return Prime.
            return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++){ // used maths class for square root of a number
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(9)); //call the function here
        
    }
    
}
