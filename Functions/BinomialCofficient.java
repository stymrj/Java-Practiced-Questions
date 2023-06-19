package Functions;

public class BinomialCofficient {
    // calculated the factorial of a number
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
// calculate the different values required for the  calculation of Binomial Coefficients
    public static int binCoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nMr=factorial(n-r);
    // Formula for the calculation:
        int binCoeff = fact_n/(fact_r*fact_nMr);
        return binCoeff;

    }

    public static void main(String[] args) {
    // here we have called the function for calculating Binomial Coefficient!!
        System.out.println(binCoeff(5, 2));
        
    }
    
}
